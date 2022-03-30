package bstorm.akimts.exo;

public class ExoTabMulti2 {

    public static void main(String[] args) {

        int[][] tab = new int[10][10];

        // parcourir les sous-tableau pour générer les valeurs des tables de mult
        for (int i = 0; i < tab.length; i++) {
            // Remplir les valeurs de la table de mult de i+1
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (i+1) * (j+1);
            }
        }


        for (int i = 0; i < tab.length; i++) {

            System.out.println("Table de " + (i+1) + ":");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print( tab[i][j] + "\t" );
            }
            System.out.println();

        }
    }
}
