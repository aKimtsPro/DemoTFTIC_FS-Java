package bstorm.akimts.exo;

import java.util.Scanner;

public class ExoSapin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer la taille du sapin");
        int taille = Integer.parseInt( sc.nextLine() );


        int ligneActuelle = 1;

        // On ecrit le sapin
        while( ligneActuelle <= taille ){
            // On ecrit la ligne actuelle
            int espaceAEcrire = taille - ligneActuelle;
            int astAEcrire = 2*ligneActuelle - 1;
            int espacesEcrits = 0;
            int astEcrits = 0;
            while(espacesEcrits + astEcrits < espaceAEcrire + astAEcrire ){

                if( espacesEcrits < espaceAEcrire ){ // s'il reste de espace à ecrire, on en ecrit
                    System.out.print(' ');
                    espacesEcrits++;
                }
                else { // sinon on ecrit des *
                    System.out.print('*');
                    astEcrits++;
                }
            }

            // On passe à la ligne suivante
            System.out.println();
            ligneActuelle++;
        }

        // On ecrit le tronc
        int espacesTroncAEcrire = taille-1;
        int espacesTroncEcrits = 0;

        while( espacesTroncEcrits < espacesTroncAEcrire ){
            System.out.print(' ');
            espacesTroncEcrits++;
        }
        System.out.print('|');

    }

}
