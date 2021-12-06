package com.brenda.classes_e_metodosnapratica.classes;

public class Animal {
    protected int tamanho;
    protected String cor;
    protected double peso;

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return this.cor;
    }


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    void dormir(){
        System.out.println("Dormir como um animal");
    }

    void correr(){
        System.out.println("Correr como um aaaanimal");
    }



}
