package com.example.aluno.contador;

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

}
