package com.example.aluno.ecommerce;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Produto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        Times time = (Times) getIntent().getSerializableExtra("times");

        //ArrayList times = (ArrayList) getIntent().getSerializableExtra("times");

        TextView textView = (TextView) findViewById(R.id.produto_texto);
        textView.append(time.getNome());

        ImageView imgView = (ImageView) findViewById(R.id.imagem_produto);
        imgView.setImageResource(time.getImagem());

        //Intent intent = getIntent();
        //String equipe = intent.getStringExtra("times");
        //String subtext = intent.getStringExtra("subtext");
        //int imagem = Integer.parseInt(intent.getStringExtra("imagem"));

        //TextView textView = (TextView) findViewById(R.id.produto_texto);
        //textView.append(equipe + "");

        //TextView textView2 = (TextView) findViewById(R.id.produto_texto);
        //textView.append(equipe + "");

        //ImageView imgView = (ImageView) findViewById(R.id.imagem_produto);
        //imgView.setImageResource(imagem);
    }
}
