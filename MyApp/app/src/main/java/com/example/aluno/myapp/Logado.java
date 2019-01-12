package com.example.aluno.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Logado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logado);
        String a = getIntent().getStringExtra("bla");
        TextView email = (TextView) findViewById(R.id.logado);
        email.setText(String.valueOf(a));
    }
}
