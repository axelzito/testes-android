package com.example.aluno.testlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lista = (ListView) findViewById(R.id.listEquipe);
        final ArrayList<String> equipes = preecheDados();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, equipes);
        lista.setAdapter(arrayAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("TAG", "usuário clicou no item: " + lista.getItemAtPosition(position).toString());
                Toast.makeText(getApplicationContext(),"Você clicou em: "+ equipes.get(position).toString(),Toast.LENGTH_LONG).show();
                mostraTela(equipes.get(position).toString());
            }
        });

    }

    private void mostraTela(String equipe) {
        Intent it = new Intent(this, AtmActivity.class);
        it.putExtra("equipe", equipe);
        startActivity(it);
    }

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
*/

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

        Times t = new Times("Atletico de Madrid",R.drawable.atleti);
        dados.add(t);

        t = new Times("Banfield",R.drawable.banfield);
        dados.add(t);

        t = new Times("Paramore",R.drawable.hayley);
        dados.add(t);

       /* t = new Times("Santos",R.drawable.santos);
        dados.add(t);

        t = new Times("Flamengo",R.drawable.flamengo);
        dados.add(t);*/

        return dados;
    }
}


