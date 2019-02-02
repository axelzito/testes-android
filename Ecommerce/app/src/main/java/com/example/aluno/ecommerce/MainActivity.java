package com.example.aluno.ecommerce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lista = (ListView) findViewById(R.id.listEquipe);
        final ArrayList<Times> equipes = preencheDados();

        TimesAdapter adapter = new TimesAdapter(this,equipes);
        lista.setAdapter(adapter);

    }

    private ArrayList<Times> preencheDados() {

        ArrayList<Times> dados = new ArrayList<Times>();

        Times t = new Times("Atletico de Madrid", "ieie", R.drawable.atleti);
        dados.add(t);

       /* t = new Times("Banfield",R.drawable.banfield);
        dados.add(t);

        t = new Times("Paramore",R.drawable.hayley);
        dados.add(t); */

       /* t = new Times("Santos",R.drawable.santos);
        dados.add(t);

        t = new Times("Flamengo",R.drawable.flamengo);
        dados.add(t);*/

        return dados;
    }
}



