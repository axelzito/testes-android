package com.example.aluno.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AtmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);

        Intent intent = getIntent();
        String equipe = intent.getStringExtra("equipe");

        TextView textView = (TextView) findViewById(R.id.texto_atm);
        textView.append(equipe + "");
    }
}
