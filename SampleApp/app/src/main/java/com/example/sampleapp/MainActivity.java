package com.example.sampleapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    EditText nomeP, apelP, emailP, passwdP;
    ListView list_pessoas;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    private List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
    ArrayAdapter<Pessoa> arrayAdapterPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeP = findViewById(R.id.txt_nomePessoa);
        apelP = findViewById(R.id.txt_apelidoPessoa);
        emailP = findViewById(R.id.txt_emailPessoa);
        passwdP = findViewById(R.id.txt_passwdPessoa);

        list_pessoas = findViewById(R.id.lv_pessoas);

        inicializaFirebase();

        listarDados();


    }

    private void listarDados() {
        databaseReference.child("Pessoa").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listaPessoa.clear();
                for(DataSnapshot objSnapshot: dataSnapshot.getChildren()){
                    Pessoa p = objSnapshot.getValue(Pessoa.class);
                    listaPessoa.add(p);
                }

                arrayAdapterPessoa = new ArrayAdapter<Pessoa>(MainActivity.this, android.R.layout.simple_list_item_1,listaPessoa);
                list_pessoas.setAdapter(arrayAdapterPessoa);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    private void inicializaFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = firebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        String nome = nomeP.getText().toString();
        String apelido = apelP.getText().toString();
        String email = emailP.getText().toString();
        String senha = passwdP.getText().toString();

        switch (item.getItemId()){
            case R.id.icon_add: {
                if (nome.equals("") || apelido.equals("") || email.equals("")) {
                    valida();
                } else {
                    Pessoa p = new Pessoa();
                    p.setUid(UUID.randomUUID().toString());
                    p.setNome(nome);
                    p.setApelido(apelido);
                    p.setEmail(email);
                    p.setPassword(senha);

                    databaseReference.child("Pessoa").child(p.getUid()).setValue(p);
                    Toast.makeText(this,"Adiciondo",Toast.LENGTH_LONG).show();
                    limparcampos();
                }

                break;
            }
            default:break;
        }
        return true;
    }

    private void limparcampos() {
        nomeP.setText("");
        apelP.setText("");
        emailP.setText("");
        passwdP.setText("");
    }

    private void valida() {
        String nome = nomeP.getText().toString();
        String apelido = apelP.getText().toString();
        String email = emailP.getText().toString();
        String senha = passwdP.getText().toString();

        if(nome.equals("")){
            nomeP.setError("Campo Requerido");
        }
        if(apelido.equals("")){
            apelP.setError("Campo Requerido");
        }
        if(email.equals("")){
            emailP.setError("Campo Requerido");
        }
        if(senha.equals("")){
            passwdP.setError("Campo Requerido");
        }
    }

}
