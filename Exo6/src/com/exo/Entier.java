package com.exo;

public class Entier implements Affichable {

    public int value;

    public Entier() {
        this.value = 0;
    }

    public Entier(int val) {
        this.value = val;
    }

    @Override
    public void affiche() {
        // TODO Auto-generated method stub
        System.out.println("Je suis un entier de valeur " + this.value);

    }

}
