package bstorm.akimts.oo.exo.methods;

import bstorm.akimts.oo.exo.classe.Sportif;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Competition {

    ArrayList<Sportif> participants = new ArrayList<>();
    boolean estLancee; // false par défaut

    boolean inscrire( Sportif aInscrire ){
        if( !estLancee && !participants.contains(aInscrire) ){
            participants.add(aInscrire);
            return true;
        }
        return false;
    }

    boolean annuler( Sportif aDesinscrire ){
        if( !estLancee ){
            return participants.remove(aDesinscrire);
        }
        return false;
    }

    Sportif lancer(){

        if( !estLancee && participants.size() >= 3 ){
            Random rdm = new Random();
            int randomizedValue = rdm.nextInt(participants.size());
            Sportif gagnant = participants.get( randomizedValue );
            return gagnant;
        }
        return null;

    }

}
