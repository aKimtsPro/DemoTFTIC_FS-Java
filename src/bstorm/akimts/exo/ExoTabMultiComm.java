package bstorm.akimts.exo;

import java.util.Scanner;

public class ExoTabMultiComm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] tab = new int[2][5];
        int nbrPairs = 0, nbrImpairs = 0;

        // L'utilisateur doit rentrer 10 nombres
        for (int i = 0; i < 10; i++) {

            int nombre = sc.nextInt();
            boolean estPair = nombre % 2 == 0;

            if( estPair &&  nbrPairs < 5){
                // pair et reste de la place
                tab[0][nbrPairs] = nombre;
                nbrPairs++;
            }
            else if( estPair && nbrPairs >= 5){
                // pair et pas de place
                nombre++;
                tab[1][nbrImpairs] = nombre;
                nbrImpairs++;
            }
            else if( !estPair && nbrImpairs < 5 ){
                // impair reste de la place
                tab[1][nbrImpairs] = nombre;
                nbrImpairs++;
            }
            else {
                // impair et pas de place
                nombre++;
                tab[0][nbrPairs] = nombre;
                nbrPairs++;
            }

        }


        int sommeGenerale = 0, sommePair = 0, sommeImpair = 0;
        float moyenneGenerale = 0, moyennePair = 0, moyenneImpair = 0;

        for (int i = 0; i < 5; i++) {

            sommePair += tab[0][i];
            sommeImpair += tab[1][i];

        }
        sommeGenerale = sommeImpair + sommePair;

        moyenneGenerale = (float) sommeGenerale / (tab[0].length + tab[1].length);
        moyennePair = (float) sommePair / tab[0].length;
        moyenneImpair = (float) sommeImpair / tab[1].length;


        System.out.println("somme générale : " + sommeGenerale);
        System.out.println("moyenne générale : " + moyenneGenerale);

        System.out.println("somme pair : " + sommePair);
        System.out.println("moyenne pair : " + moyennePair);

        System.out.println("somme impair : " + sommeImpair);
        System.out.println("moyenne impair : " + moyenneImpair);
        // 12 8 64 54 2 | pair
        //  5 9  1  1 1 | impair

        // i = 0

        // sommeP = 12
        // sommeI = 5


    }

}
