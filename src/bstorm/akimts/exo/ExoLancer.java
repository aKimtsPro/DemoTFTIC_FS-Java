package bstorm.akimts.exo;

import java.util.Scanner;

public class ExoLancer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer le nombre de balles en stock.");
        int stock = Integer.parseInt( sc.nextLine() );
        char consentement;

        if(stock > 0){

            do {
                System.out.println("Voulez-vous qu'une balle soit lancée? (y/N)");
                consentement = sc.nextLine().charAt(0); // le premier char de l'entrée utilisateur

                if(consentement == 'y'){
                    System.out.println("-- BALLE LANCEE --");
                    System.out.println("il reste " + (--stock) + " balles." ); // ATTENTION le stock est décrémenté (pré-décrém) directment ici
                }
                else {
                    System.out.println("au revoir");
                }

            }while( consentement == 'y' && stock > 0 );

        }
        else if (stock == 0) {
            System.out.println("Le stock est vide");
        }
        else { // stock < 0
            System.out.println("Stock invalide");
        }

    }

}
