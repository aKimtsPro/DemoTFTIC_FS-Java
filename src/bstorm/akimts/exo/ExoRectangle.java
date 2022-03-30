package bstorm.akimts.exo;

import java.util.Scanner;

public class ExoRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer la taille du rectangle");
        int taille = Integer.parseInt( sc.nextLine() );

        // Il est aussi possible d'inverser l'algorithme
        // en partant de l'idée 'ligneAEcrireRestantes'
        // ceci changerait quelques lignes modifiées dans le programme

        int lignesEcrites = 0;
        while ( lignesEcrites < taille ){ // tant qu'on a pas écrit toutes les lignes

            // on ecrit une ligne

            int nbrAstEcrits = 0;
            while (nbrAstEcrits <= lignesEcrites){ // Tant qu'on n'a pas ecrit le bon nombre d'* sur la ligne
                // On ecrit un * sur la ligne
                System.out.print('*');
                nbrAstEcrits++;
            }
            System.out.println();
            lignesEcrites++;

        }

        int l_e;
        for( l_e = 0; l_e < taille ; l_e++ ){
            // on ecrit une ligne
            for( int a_e = 0; a_e <= l_e; a_e++ ){ // Tant qu'on n'a pas ecrit le bon nombre d'* sur la ligne
                // On ecrit un * sur la ligne
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(l_e);

    }

}
