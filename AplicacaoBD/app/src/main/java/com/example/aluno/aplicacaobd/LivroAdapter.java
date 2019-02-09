package com.example.aluno.aplicacaobd;

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

    class LivroViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvName, tvAutor;

        LivroViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvAutor = itemView.findViewById(R.id.tvAutor);
            itemView.setOnClickListener(this);
        }

        void bind(Livro livro) {
            tvName.setText(livro.getTitulo());
            tvAutor.setText(livro.getAutor());
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), livros.get(getAdapterPosition()).getTitulo(), Toast.LENGTH_SHORT).show();
        }
    }
}
