package com.example.aluno.aplicacaobd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void addlivro() {
        /* intent = new Intent(this, Logado.class);
        TextView email = (TextView) findViewById(R.id.email);
        String login = "Olá, " + email.getText().toString();
        intent.putExtra("bla", login);
        startActivity(intent);*/

        //intent = new Intent();
    }

    public void listaLivros(){
        startActivity(new Intent(this, ListarLivroActivity.class));
    }
}
