package com.example.aluno.aplicacaobd;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by aluno on 09/02/19.
 */

public class LivroAdapter extends RecyclerView.Adapter<LivroAdapter.LivroViewHolder> {

    private List<Livro> livros;
    private IExcluirLivro iExcluirLivro;

    public void setiExcluirLivro(IExcluirLivro iExcluirLivro) {
        this.iExcluirLivro = iExcluirLivro;
    }

    public LivroAdapter(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public LivroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.livro_item, parent, false);
        return new LivroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LivroViewHolder holder, int position) {
        holder.bind(livros.get(position));
    }

    @Override
    public int getItemCount() {
        return livros.size();
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
        notifyItemInserted(livros.size() - 1);
    }

    public void removeLivro(int position) {
        livros.remove(position);
        notifyItemRemoved(position);
    }

    class LivroViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvName, tvAutor;

        LivroViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvAutor = itemView.findViewById(R.id.tvAutor);
            itemView.setOnClickListener(this);
        }

        void bind(Livro livro) {
            tvName.setText("Nome livro: " + livro.getTitulo());
            tvAutor.setText("Nome autor: " + livro.getAutor());
        }

        @Override
        public void onClick(View view) {

            UIUtils.showAlertBuilder(view.getContext(), null, "Ecluir Livro", "Deseja excluir?", "Sim", "Não", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if(i == DialogInterface.BUTTON_POSITIVE) {
                        int position = getAdapterPosition();
                        iExcluirLivro.ExcluirLivro(livros.get(position));
                        removeLivro(position);
                    }
                }
            }, new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialogInterface) {

                }
            });
            Toast.makeText(view.getContext(), livros.get(getAdapterPosition()).getTitulo(), Toast.LENGTH_SHORT).show();
        }

    }

    interface IExcluirLivro {
        void ExcluirLivro(Livro livro);
    }
}
