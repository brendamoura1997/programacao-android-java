package com.brenda.classes_e_metodosnapratica;

public class Brenda extends Cidadao implements Presidente {
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleição no Brasil");
    }
}
