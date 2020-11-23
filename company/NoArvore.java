package com.company;

public class NoArvore {
    public int valor;
    public NoArvore esquerda;
    public NoArvore direita;

    public NoArvore (int valor){
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

}