package com.example.aluno.aplicacaobd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListarLivroActivity extends AppCompatActivity {

    private LivroAdapter livroAdapter;

    private RecyclerView rvLivros;

    private List<Livro> livros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_livro);

        rvLivros = (RecyclerView) findViewById(R.id.lista_itens);

        livros = new ArrayList<>();


        livros.add(new Livro("1", "aaa", "bbb", "ccc"));
        livros.add(new Livro("1", "aaa", "bbb", "ccc"));
        livros.add(new Livro("1", "aaa", "bbb", "ccc"));
        livros.add(new Livro("1", "aaa", "bbb", "ccc"));
        livros.add(new Livro("1", "aaa", "bbb", "ccc"));
        livros.add(new Livro("1", "aaa", "bbb", "ccc"));


        livroAdapter = new LivroAdapter(livros);

        rvLivros.setAdapter(livroAdapter);
        rvLivros.setLayoutManager(new LinearLayoutManager(this));
        rvLivros.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
