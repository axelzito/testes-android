package com.example.aluno.aplicacaobd;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by aluno on 09/02/19.
 */

public class Controller {

    private SQLiteDatabase db;
    private CriaBanco banco;

    public Controller(Context context) {
        banco = new CriaBanco(context);
    }

    // Metodo Inserir
    public String insereDados(String titulo, String autor, String editora) {

        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.TITULO,titulo);
        valores.put(CriaBanco.AUTOR,autor);
        valores.put(CriaBanco.EDITORA,editora);

        resultado = db.insert(CriaBanco.TABELA, null, valores);
        db.close();

        if (resultado == -1) {
            return "Erro ao inserir registro!!!";
        } else {
            return "Registro inserido com sucesso!!!";
        }
    }

    //Metodo Carrega dados
    

}
