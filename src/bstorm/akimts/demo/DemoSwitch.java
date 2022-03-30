package bstorm.akimts.demo;

import java.util.Scanner;

public class DemoSwitch {

    public static void main(String[] args) {

        int age = 13;

        switch( age ){
            case 11, 13, 14:
            case 12:
                System.out.println("Vous devenez adolescent");
                break;
            case 18:
                System.out.println("Vous devenez adulte");
                break;
            case 40:
                System.out.println("C'est la crise de la 40aine");
                break;
            case 62:
                System.out.println("C'est la retraite");
                break;
            default:
                System.out.println("Vous n'êtes pas à un age pivot");
                break;
        }

        System.out.println("Je suis sorti du switch");
    }

}
