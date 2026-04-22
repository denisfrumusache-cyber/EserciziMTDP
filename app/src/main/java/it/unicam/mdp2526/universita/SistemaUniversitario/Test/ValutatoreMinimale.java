package it.unicam.mdp2526.universita.SistemaUniversitario.Test;

import it.unicam.mdp2526.universita.SistemaUniversitario.ClassiPrincipali.Studente;
import it.unicam.mdp2526.universita.SistemaUniversitario.Contratti.Valutatore;

public class ValutatoreMinimale implements Valutatore {
    @Override
    public int assegnaVoto(Studente studente) {
        return 18;
    }
}
