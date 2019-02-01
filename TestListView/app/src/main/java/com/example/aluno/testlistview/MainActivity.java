package com.example.aluno.testlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ListView lista = (ListView) findViewById(R.id.listEquipe);
    ArrayList<String> equipes = preecheDados();

    private ArrayList<String> preecheDados() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Atletico de Madrid");
        dados.add("Banfield");
        dados.add("BVB");
        dados.add("VIIILAAAAAA");
        dados.add("Goiás");
        dados.add("Ibis");
        dados.add("Goiânia FC");
        dados.add("FCB");
        dados.add("Cúrintia");
        dados.add("Rayo Vallecano");

        return dados;
    }

}
