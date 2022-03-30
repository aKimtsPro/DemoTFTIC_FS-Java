package bstorm.akimts.exo;

import java.util.Scanner;

public class ExoIfs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est votre nom?");
        String nom = sc.nextLine();

        System.out.println("Quel est votre âge?");
//        String ageString = sc.nextLine();
        int age = Integer.parseInt( sc.nextLine() /* ageString */ );

        if(age > 18){
            System.out.println("Pas d'évaluation, tu es trop vieux");
        }
        else if(age < 0){
            System.out.println("Vous n'existez pas");
        }
        else { // age >= 0 && age <= 18

            System.out.println("Quel est votre résultat sur 20 (0 -> 20)?");
            int rslt = Integer.parseInt( sc.nextLine() );

            if( rslt < 0 || rslt > 20 ){
                System.out.println("Résultat invalide");
            }
            else if( rslt >= 18 ){ // 18 - 20
                System.out.println("Excellent!");
            }
            else if( rslt >= 15 ){ // 15 - 17
                System.out.println("TBien!");
            }
            else if( rslt >= 12 ) { // 12 - 14
                System.out.println("Bien");
            }
            else if( rslt >= 10 ){ // 10 - 11
                System.out.println("Satisfaisant");
            }
            else { // 0 - 9
                System.out.println("Raté");
            }
        }
    }
}
