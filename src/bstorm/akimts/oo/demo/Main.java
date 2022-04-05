package bstorm.akimts.oo.demo;

public class Main {

    public static void main(String[] args) {

        Voiture v = new Voiture();
        v.reservoir = 30;
        v.marque = "VrimVroom";
        v.modele = "BipBoup";
        v.puissance = 75;

        System.out.println(v.reservoir);
        System.out.println(v.kmParcourus);

        int rslt = v.seDeplacer(100) / 8;

        System.out.println(v.reservoir);
        System.out.println(v.kmParcourus);

    }

}
