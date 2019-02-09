package com.example.aluno.aplicacaobd;

/**
 * Created by aluno on 09/02/19.
 */

public class Livro {

    public String id;
    public String titulo;
    public String autor;
    public String editor;

    public Livro() {
    }

    public Livro(String id, String titulo, String autor, String editor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editor = editor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
