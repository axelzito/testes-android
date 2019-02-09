package com.example.aluno.aplicacaobd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static com.example.aluno.aplicacaobd.CriaBanco.TABELA;


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

        resultado = db.insert(TABELA, null, valores);
        db.close();

        if (resultado == -1) {
            return "Erro ao inserir registro!!!";
        } else {
            return "Registro inserido com sucesso!!!";
        }
    }

    //Metodo Carrega dados
    public List<Livro> carregaDados() {

        List<Livro> listaLivros = new ArrayList<Livro>();

        String selectQuerry = "SELECT * FROM " + TABELA;

        db = banco.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuerry, null);

        if (cursor != null && cursor.moveToFirst()) {
            do {
                Livro livro = new Livro();
                livro.setId(Integer.parseInt(cursor.getString(0)));
                livro.setTitulo(cursor.getString(1));
                livro.setAutor(cursor.getString(2));
                livro.setEditor(cursor.getString(3));

                listaLivros.add(livro);
            } while (cursor.moveToNext());
        }

        db.close();
        return listaLivros;
    }

    public Livro retorna(String id) {

        db = banco.getReadableDatabase();

        Cursor cursor = db.query(CriaBanco.TABELA, new String[] {
                        CriaBanco.ID, CriaBanco.TITULO, CriaBanco.AUTOR, CriaBanco.EDITORA },
                CriaBanco.ID + "=?",
                new String[] {String.valueOf(id) },
                null,
                null,
                null);

        Livro livro = null;
        if (cursor != null) {
            cursor.moveToFirst();
            livro = new Livro();
            livro.setId(Integer.parseInt(cursor.getString(0)));
            livro.setTitulo(cursor.getString(1));
            livro.setAutor(cursor.getString(2));
            livro.setEditor(cursor.getString(3));

            db.close();
            return livro;
        } else {
            throw new RuntimeException("deu nao fera!!");
        }
    }

    public int update(Livro livro) {

        db = banco.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(CriaBanco.TITULO, livro.getTitulo());
        valores.put(CriaBanco.AUTOR, livro.getAutor());
        valores.put(CriaBanco.EDITORA, livro.getEditor());

        return db.update(CriaBanco.TABELA, valores,
                CriaBanco.ID + " = ? ",
                new String[] { String.valueOf(livro.getId()) });
    }

    public void delete(Livro livro) {
        db = banco.getWritableDatabase();
        db.delete(CriaBanco.TABELA, CriaBanco.ID + " = ? ",
                new String[] { String.valueOf(livro.getId()) } );
        db.close();
    }
}
