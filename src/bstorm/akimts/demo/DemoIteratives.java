package bstorm.akimts.demo;

import java.util.Scanner;

public class DemoIteratives {

    public static void main(String[] args) {

        String chaine = "";
        // chaine = "aaaaa" | taille = 5
        while ( chaine.length() < 5 ){
            chaine += 'a';
        }

        //


        System.out.println( chaine ); // aaaaa

        Scanner sc = new Scanner(System.in);

        int nbr = 5;
        do {
            System.out.println("Veuillez entrer un nombre positif");
            nbr = sc.nextInt();
        } while (/*condition continuer*/nbr < 0); // condition d'arret: nbr >= 0
        boolean b= "a" != "a";



        // for

        System.out.println( "--- FOR ---" );

        int compteur = 0; // declaration de variable / init
        while(compteur < 5){ // condition de continuation
            System.out.println(compteur);
            compteur++; // instruction de fin d'itération
        }

        //

        String aParcourir = "ma chaine de caractère";

        int position = 0;
        while (position < aParcourir.length()){
            System.out.println( aParcourir.charAt( position ) );
            position++;
        }

        for (int i = 0; i < aParcourir.length(); i++) {
            System.out.println( aParcourir.charAt(i) );
        }

    }

}
