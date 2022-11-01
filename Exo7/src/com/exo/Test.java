package com.exo;

public class Test {
    public static void main(String[] args){
        Compte cmp = new Compte();
        CompteEpargne cmpEp = new CompteEpargne();
        CompteSecurise cmpSe = new CompteSecurise();

        cmp.Deposer(1000);
        cmpEp.Deposer(30000);
        cmpSe.Deposer(200000);

        System.out.println("Compte ");
        cmp.afficher();
        cmp.Retirer(300);
        cmp.afficher();

        System.out.println("\nCompte Epargne ");
        cmpEp.afficher();
        cmpEp.Retirer(3000);
        cmpEp.afficher();

        System.out.println("\nCompte Securiser  ");
        cmpSe.afficher();
        cmpSe.Retirer(4000);
        cmpSe.afficher();

    }
}
