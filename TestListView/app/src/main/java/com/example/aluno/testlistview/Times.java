package com.example.aluno.testlistview;

/**
 * Created by axel on 02/02/19.
 */

public class Times{

    private String nome;
    private int imagem;

    public Times(){

    }

    public Times(String nome, int imagem){
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

