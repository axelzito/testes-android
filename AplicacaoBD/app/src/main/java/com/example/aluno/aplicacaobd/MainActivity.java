package com.example.aluno.aplicacaobd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListar = (Button) findViewById(R.id.botao_listar);
        btnListar.setOnClickListener(this);
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
        startActivity(new Intent(this, ListarLivroActivity.class));
    }
}
