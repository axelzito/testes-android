package com.example.aluno.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

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
