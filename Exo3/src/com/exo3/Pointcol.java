package com.exo3;

public class Pointcol extends  Point{
    public byte couleur;

    public Pointcol(float x,float y,byte couleur){
        super(x, y);
        this.couleur = couleur;
    }

    public void colorer(){
        System.out.println("colorer");
    }

    public void afficher(){
        super.afficher();
        System.out.println("Et Couleur : "+this.couleur);
    }

    
}
