package bstorm.akimts.oo.exo.methods;

public class Compte {

    double solde;
    String nomProp;
    String numCompte;
    double ligneCredit;

    Compte( String nomProp, String numCompte, double ligneCredit ){
        this.nomProp = nomProp;
        this.numCompte = numCompte;
        this.ligneCredit = ligneCredit;
    }

    void retrait( double montant ){
        if( montant > 0 && montant <= solde + ligneCredit ){
            solde -= montant;
        }
    }

    void depot( double montant ){
        if( montant > 0 ){
            solde += montant;
        }
    }


}
