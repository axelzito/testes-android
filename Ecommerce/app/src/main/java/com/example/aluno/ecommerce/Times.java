package com.example.aluno.ecommerce;

/**
 * Created by axel on 02/02/19.
 */

public class Times{

    private String nome;
    private String subnome;
    private int imagem;

    public Times(){

    }

    public Times(String nome, String subnome, int imagem){
        this.nome = nome;
        this.subnome = subnome;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSubnome() {
        return subnome;
    }

    public void setSubome(String subnome) {
        this.subnome = subnome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

