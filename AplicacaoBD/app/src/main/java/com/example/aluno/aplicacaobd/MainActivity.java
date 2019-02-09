package com.example.aluno.aplicacaobd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnListar;
    Button btnAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListar = (Button) findViewById(R.id.botao_listar);
        btnListar.setOnClickListener(this);

        btnAdicionar = (Button) findViewById(R.id.botao_adicionar);
        btnAdicionar.setOnClickListener(this);
    }

    private void addlivro() {
        /* intent = new Intent(this, Logado.class);
        TextView email = (TextView) findViewById(R.id.email);
        String login = "Olá, " + email.getText().toString();
        intent.putExtra("bla", login);
        startActivity(intent);*/

        //intent = new Intent();
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.botao_listar) {
            startActivity(new Intent(this, ListarLivroActivity.class));
        }

        if (view.getId() == R.id.botao_adicionar) {
            startActivity(new Intent(this, AdicionarLivro.class));
        }
    }
}
