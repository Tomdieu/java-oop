package com.exo4;

public class Test {
    public static void main(String[] args) throws Exception {

        int n = (int)Math.random()*100+10;
        // initialisation du tableau
        Point [] tableau = new Point[n];

        System.out.println(n);

        for(int i =0;i<n;i++){
            float r = (float) (Math.random()*100);
            if( r < 20){
                Point p = new Point((float)Math.random()*100,(float)Math.random()*100);
                tableau[i] = p;

            }
            else{
                Pointcol p = new Pointcol((float)Math.random()*100,(float)Math.random()*100,(byte)6);
                tableau[i] = p;
            }

            
        }
        int i =1;
        // affichage
        for (Point point : tableau) {
            System.out.println(i+" : ");
            point.afficher();
            point.identifie();
            i++;
        }


    }
}
