package bstorm.akimts.exo;

import java.util.Scanner;

public class ExoTabMulti {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] tab = new int[2][5];

        int nbrPair = 0, nbrImpair = 0;

        for (int i = 0; i < 10; i++) {

            int input = sc.nextInt();
            boolean estPair = input % 2 == 0;

            if( estPair && nbrPair < 5 )
                tab[0][nbrPair++] = input;
            else if( estPair )
                tab[1][nbrImpair++] = ++input;
            else if ( nbrImpair < 5 )
                tab[1][nbrImpair++] = input;
            else
                tab[0][nbrPair++] = ++input;

        }

        // Calcul des moyennes / sommes
        float[][] tabAggreg = new float[3][2];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tabAggreg[0][0] += tab[i][j];
                tabAggreg[i+1][0] += tab[i][j];
            }
        }

        tabAggreg[0][1] = tabAggreg[0][0] / (tab[0].length + tab[1].length);
        tabAggreg[1][1] = tabAggreg[1][0] / tab[0].length;
        tabAggreg[2][1] = tabAggreg[2][0] / tab[1].length;

        System.out.println("somme générale : " + tabAggreg[0][0]);
        System.out.println("moyenne générale : " + tabAggreg[0][1]);

        System.out.println("somme pair : " + tabAggreg[1][0]);
        System.out.println("moyenne pair : " + tabAggreg[1][1]);

        System.out.println("somme impair : " + tabAggreg[2][0]);
        System.out.println("moyenne impair : " + tabAggreg[2][1]);


    }

}
