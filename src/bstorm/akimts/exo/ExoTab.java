package bstorm.akimts.exo;

import java.util.Scanner;

public class ExoTab {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez choisir la taille du tableau(entre 1 et 100): ");
        int taille = sc.nextInt();

        if( taille > 0 && taille <= 100 ){
            int[] tab = new int[taille];

            int somme = 0;
            for (int i = 0; i < tab.length; i++) {
                System.out.print("remplir la case d'index " + i + ": ");
                tab[i] = sc.nextInt();
                somme += tab[i];
            }

            System.out.println("somme: " + somme);
            System.out.println("moyenne: " + ( (float) somme / tab.length ));
        }
        else {
            System.out.println("La taille n'est pas valide");
        }


    }

}
