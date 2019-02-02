package com.example.aluno.ecommerce;

/**
 * Created by axel on 02/02/19.
 */

public class Times{

    private String nome;
    private String subnome;
    private double preco;
    private int imagem;

    public Times(){

    }

    public Times(String nome, String subnome, double preco, int imagem){
        this.nome = nome;
        this.subnome = subnome;
        this.preco = preco;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSubnome() { return subnome; }

    public void setSubnome(String subnome) { this.subnome = subnome; }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public double getPreco() { return preco; }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

