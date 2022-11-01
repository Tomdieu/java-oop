package com.exo3;

public class Test {
    public static void main(String[] args) throws Exception {

        // initialisation du tableau
        Point [] tableau = new Point[10];

        for(int i =0;i<10;i++){
            float r = (float) (Math.random()*100);
            if( r < 20){
                Point p = new Point((float)Math.random()*100,(float)Math.random()*100);
                tableau[i] = p;

            }
            else{
                Pointcol p = new Pointcol((float)Math.random()*100,(float)Math.random()*100,(byte)Math.random());
                tableau[i] = p;
            }

            
        }
        // affichage
        for (Point point : tableau) {
            point.afficher();
        }


    }
}
