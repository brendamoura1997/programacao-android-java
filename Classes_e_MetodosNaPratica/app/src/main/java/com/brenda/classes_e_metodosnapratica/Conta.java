package com.brenda.classes_e_metodosnapratica;

public class Conta {
    protected int numConta;
    private double saldo = 100;

    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo = this.saldo - valorSaque;
    }

    public double recuperarSaldo(){
        return this.saldo;
    }


}
