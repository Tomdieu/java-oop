package com.exo;

public class CompteEpargne extends Compte{
    
    public CompteEpargne(){
        super();
    }

    public void augementerSolde(int taux){
        this.solde += (this.solde*(taux/100));
    }

    public void augementerSolde(float taux){
        this.solde += (this.solde*(taux));
    }

}
