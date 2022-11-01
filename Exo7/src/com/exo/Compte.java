package com.exo;

public class Compte {
    public int solde = 0;
    public String Numero, Proprietaire;

    public void Deposer(int montant) {
        solde += montant;
    }

    public void Retirer(int montant) {
        System.out.println("Retrait $"+montant);
        this.solde -= montant;
        System.out.println("Solde Restatant : $"+this.solde);
    }

    public void afficher(){
        System.out.println("Solde : $"+this.solde);
    }
}
