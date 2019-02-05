package com.example.aluno.ecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
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

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("TAG", "usuário clicou no item: " + lista.getItemAtPosition(position).toString());
                Toast.makeText(getApplicationContext(),"Você clicou em: "+ equipes.get(position).toString(),Toast.LENGTH_LONG).show();
                //mostraTela(equipes.get(position).getNome(), equipes.get(position).getSubnome(), equipes.get(position).getImagem());
                mostraTela(equipes.get(position));
            }
        });

    }

    /*
    private void mostraTela(String equipe, String subtext, int imagem) {
        Intent it = new Intent(this, Produto.class);
        it.putExtra("equipe", equipe);
        it.putExtra("subtext", subtext);
        it.putExtra("imagem", imagem);
        startActivity(it);
    } */

    private void mostraTela(Times times) {
        Intent it = new Intent(this, Produto.class);
        it.putExtra("times", times);
        startActivity(it);
    }

    private ArrayList<Times> preencheDados() {

        ArrayList<Times> dados = new ArrayList<Times>();

        Times t = new Times("Iphone 8s 100% original dos bons pá tal topzera", "tela 5' 8 de ram processador topzera etc e tal", "R$ 5000,00", R.drawable.atleti);
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



