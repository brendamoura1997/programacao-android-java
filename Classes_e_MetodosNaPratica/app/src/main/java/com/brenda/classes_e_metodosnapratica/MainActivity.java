package com.brenda.classes_e_metodosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.brenda.classes_e_metodosnapratica.classes.Animal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ContaBancaria conta = new ContaBancaria(2020);

    Brenda brenda = new Brenda();
    Obama obama = new Obama();
    obama.direitosDeveres();

        /*
        Pessoa pessoa = new Pessoa();
        pessoa.exibirDados("BRENDA");
        pessoa.exibirDados("BRENDA", 23);*/



        //int numero = 10;
        //Casa minhaCasa =

       /** Casa minhaCasa = new Casa(); //assim a gente instancia / cria um objeto

        Casa minhaCasa2;
        minhaCasa2 = new Casa();

        minhaCasa.cor = "Cor";

        Casa minhaCasa2 = new Casa();
        minhaCasa.cor = "Branca";

        System.out.println(minhaCasa.cor);*/

        //minhaCasa.abrirPorta();

        /*Funcionario funcionario = new Funcionario();

        funcionario.nome = "Adalberto";
        funcionario.salario = 920.00;

        double salariorecuperado = funcionario.recuperarSalario(150, 20);
        System.out.println("O salario do Adalberto é: "+salariorecuperado);


            Usuario usuario = new Usuario();

            usuario.exibirNome("Moura");*/


        /*Animal animal = new Animal();
        animal.correr();

        Cao cao = new Cao();
        cao.latir();
        cao.setCor("Azul");
        cao.correr();
        System.out.println(cao.getCor());

        Passaro passaro = new Passaro();
        passaro.voar();*/

/*
        Conta conta  = new Conta();
        conta.depositar(100);
        conta.sacar(50);
        conta.recuperarSaldo();
        System.out.println("saldo: "+conta.recuperarSaldo());

        Animal animal = new Animal();
        */














    }
}
