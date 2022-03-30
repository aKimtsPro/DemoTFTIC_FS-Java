package bstorm.akimts.exo;

import java.util.Scanner;

public class ExoSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer le premier terme:");
        int premierTerme = Integer.parseInt( sc.nextLine() );
        System.out.println("Veuillez entrer le second terme:");
        int secondTerme = Integer.parseInt( sc.nextLine() );
        System.out.println("Veuillez entrer l'opération à réaliser");
        char operation = sc.nextLine().charAt(0);

        switch ( operation ){
            case '+', 'p' -> {
                System.out.println(premierTerme + " + " + secondTerme + " = " + (premierTerme + secondTerme));
            } // addition
            case '-' -> {
                System.out.println(premierTerme + " - " + secondTerme + " = " + (premierTerme - secondTerme));
            } // soustraction
            case '*' -> {
                System.out.println(premierTerme + " * " + secondTerme + " = " + (premierTerme * secondTerme));
            } // multiplication
            case '/' -> {
                if( secondTerme != 0 ){
                    System.out.println(premierTerme + " / " + secondTerme + " = " + ((float)premierTerme / secondTerme));
                }
                else {
                    System.out.println("opération impossible");
                }
            } // division réelle
            case '%' -> {
                if( secondTerme != 0 )
                    System.out.println(premierTerme + " % " + secondTerme + " = " + (premierTerme % secondTerme));
                else
                    System.out.println("opération impossible");
            } // modulo
            case '\\' -> {
                if( secondTerme != 0 )
                    System.out.println(premierTerme + " \\ " + secondTerme + " = " + (premierTerme / secondTerme));
                else
                    System.out.println("opération impossible");
                break;
            } // division entière
            default -> {
                System.out.println("opération invalide");
            }

        }

    }

}
