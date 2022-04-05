package bstorm.akimts.oo.exo.classe;

import bstorm.akimts.oo.exo.methods.Compte;

public class Main {

    public static void main(String[] args) {

        Sportif sportif = new Sportif();
        sportif.nom = "Dubois";
        sportif.prenom = "Luc";

        Sport basketball = new Sport();
        basketball.nom = "basketball";

        sportif.nbrVictoire++;
        basketball.champion = sportif;

    }

}
