package com.brenda.classes_e_metodosnapratica;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;


    public ContaBancaria(){
        System.out.println("Configurações iniciais");
    }

    public ContaBancaria(int nConta){
        //System.out.println("CONSTRUTOR CHAMADO: "+nConta);
        this.numeroConta = nConta;
    }


}
