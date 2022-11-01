package com.exo4;

public class Pointcol extends  Point{
    public byte couleur;

    public Pointcol(float x,float y,byte couleur){
        super(x, y);
        this.couleur = couleur;
    }

    public void colorer(byte couleur){
        this.couleur = couleur;
        // System.out.println("colorer");
    }
    public void identifie(){
        System.out.println("Je suis un point coloré de couleur `"+this.couleur+"`");
    }
    
}
