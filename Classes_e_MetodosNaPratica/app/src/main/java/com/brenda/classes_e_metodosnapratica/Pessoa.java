package com.brenda.classes_e_metodosnapratica;

public class Pessoa {
    private String nome;
    private int idade;

    public void exibirDados(String nome){
        //this.nome = "BRENDA";
        System.out.println("Exibir apenas nome: "+nome);
    }

    public void exibirDados(String nome, int idade){
        System.out.println("Exibir nome: "+nome+" e idade: "+idade);
    }

}
