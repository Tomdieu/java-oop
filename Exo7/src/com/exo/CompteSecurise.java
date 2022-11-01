package com.exo;

public class CompteSecurise extends Compte{
    @Override
    public void Retirer(int montant){
        if(montant <= this.solde){
            // this.solde -= montant;
            super.Retirer(montant);
        }
        else{
            System.out.println("Solde Insuffissant!");
        }
    }
}
