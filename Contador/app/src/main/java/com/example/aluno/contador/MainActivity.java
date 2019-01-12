package com.example.aluno.contador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int placarA = 0;
    int placarB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayTimeA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pontosA);
        scoreView.setText(String.valueOf(score));
    }

    public void add3pontosA(View view) {
        placarA = placarA + 3;
        displayTimeA(placarA);
    }

    public void add2pontosA(View view) {
        placarA = placarA + 2;
        displayTimeA(placarA);
    }

    public void addtirolivreA(View view) {
        placarA = placarA + 1;
        displayTimeA(placarA);
    }

    public void displayTimeB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pontosB);
        scoreView.setText(String.valueOf(score));
    }

    public void add3pontosB(View view) {
        placarB = placarB + 3;
        displayTimeB(placarB);
    }

    public void add2pontosB(View view) {
        placarB = placarB + 2;
        displayTimeB(placarB);
    }

    public void addtirolivreB(View view) {
        placarB = placarB + 1;
        displayTimeB(placarB);
    }

    public void reset(View view) {
        placarA = 0;
        displayTimeA(placarA);
        placarB = 0;
        displayTimeB(placarB);
    }

    public void sobre(View view){
        Intent intent = new Intent(this, Sobre.class);
        startActivity(intent);
    }
}
