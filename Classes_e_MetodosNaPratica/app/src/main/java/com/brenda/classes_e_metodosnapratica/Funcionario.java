package com.brenda.classes_e_metodosnapratica;

public class Funcionario {
    //propriedades

    String nome;
    double salario;


    //METODOS
    /*Vou criar um método que recupere o salário*/
    //ele é sem retorno, ele apenas executa o que está dentro das chaves
    /*void recuperarSalario(){
        this.salario = this.salario - (this.salario * 0.1);

        System.out.println(this.salario);
    }*/

    double recuperarSalario(double bonus, double descontoAdicional){
        this.salario = this.salario - (this.salario * 0.1);
        return this.salario + bonus - descontoAdicional;

        //System.out.println(this.salario);
    }

}
