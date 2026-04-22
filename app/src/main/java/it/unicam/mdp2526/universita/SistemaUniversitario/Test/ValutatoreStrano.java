package it.unicam.mdp2526.universita.SistemaUniversitario.Test;

import it.unicam.mdp2526.universita.SistemaUniversitario.ClassiPrincipali.Studente;
import it.unicam.mdp2526.universita.SistemaUniversitario.Contratti.Valutatore;

public class ValutatoreStrano implements Valutatore {
    public int assegnaVoto(Studente studente){
        return -10;
    }
}
