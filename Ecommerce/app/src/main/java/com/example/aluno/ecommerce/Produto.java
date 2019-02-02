package com.example.aluno.ecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Produto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        Intent intent = getIntent();
        String equipe = intent.getStringExtra("equipe");

        TextView textView = (TextView) findViewById(R.id.produto_texto);
        textView.append(equipe + "");
    }
}
