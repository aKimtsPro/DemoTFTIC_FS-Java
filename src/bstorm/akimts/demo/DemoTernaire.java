package bstorm.akimts.demo;

public class DemoTernaire {

    public static void main(String[] args) {

        int age = 55;

//        if( age >= 18)
//            System.out.println("Vous êtes un adulte");
//        else
//            System.out.println("Vous êtes un enfant");

        System.out.println( age >= 18 ? "Vous êtes un adulte" : "Vous êtes un enfant" );

    }

}
