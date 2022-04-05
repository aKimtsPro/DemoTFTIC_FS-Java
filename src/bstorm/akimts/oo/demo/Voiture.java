package bstorm.akimts.oo.demo;

public class Voiture {

    String marque;
    String modele;
    byte nbrPortes;
    short puissance;
    Couleur couleur;

    int kmParcourus;
    double reservoir;

    // definir un moyen pour ma voiture de se déplacer de X kilometre.
    // La voiture ne bouge plus si son reservoir est vide.
    // On veut savoir le nombre de km parcourus sur ce trajet.
    // (pour la démo conso de 5l/100)
    int seDeplacer( int aParcourir ){

        double aDepenser =  aParcourir * 5 / 100.;

        if( aDepenser > reservoir ){
            int kmEffectifParcouru = (int)(reservoir / 0.05);
            reservoir = 0;
            kmParcourus += kmEffectifParcouru;
            return kmEffectifParcouru;
        }
        else {
            reservoir -= aDepenser;
            kmParcourus += aParcourir;
            return aParcourir;
        }
    }

    void remplirReservoir(double litres){
        if( litres > 0 )
            reservoir += litres;
    }


}
