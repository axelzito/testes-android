package com.example.aluno.aplicacaobd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdicionarLivro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_livro);

        Button btnCadastro = (Button) findViewById(R.id.botao_adicionar_dados);

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Controller crud = new Controller(getBaseContext());

                EditText titulo = (EditText) findViewById(R.id.nome_livro);
                EditText autor = (EditText) findViewById(R.id.nome_autor);
                EditText editora = (EditText) findViewById(R.id.nome_editora);

                String tituloString = titulo.getText().toString();
                String autorString = autor.getText().toString();
                String editoraString = editora.getText().toString();

                String resultado;

                resultado = crud.insereDados(tituloString, autorString, editoraString);
                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
    }

}
