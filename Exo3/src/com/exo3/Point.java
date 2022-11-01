package com.exo3;

public class Point {
    public Point(float x,float y){
        this.x = x;
        this.y = y;
    }

    public void initialiser(float x,float y){
        this.x = x;
        this.y = y;
    }

    public void deplacer(float x,float y){
        this.x += x;
        this.y += y;
    }
    public void afficher(){
        System.out.println("je suis un point de coordonees "+this.x+" et "+this.y);
    }

    public float x,y;
}
