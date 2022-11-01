package com.exo;

public class Flottant implements Affichable {
    public float value;

    public Flottant() {
        this.value = 0.f;
    }

    public Flottant(float val) {
        this.value = val;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis un flottant de valeur " + this.value);
    }

}
