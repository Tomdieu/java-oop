package com.exo;

public class Entier extends Affichable {
    public int value;
    public Entier(){
        this.value = 0;
    }
    public Entier(int val){
        this.value = val;
    }
    public void affiche(){
        System.out.println("Je suis un entier de valeur "+this.value);
    }
}
