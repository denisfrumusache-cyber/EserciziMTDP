package it.unicam.mdp2526.universita.Utils;

import it.unicam.mdp2526.universita.SistemaUniversitario.ClassiPrincipali.Esame;

public class EsameSuperato {
    Esame esame;
    int voto;

    public EsameSuperato(Esame esame, int voto) {
        if (esame == null) {
            throw new IllegalArgumentException("Esame non valido");
        }
        this.esame = esame;

        if (voto < 18 || voto > 31) {
            throw new IllegalArgumentException("Voto non valido");
        }
        this.voto = voto;
    }

    public Esame getEsame() {
        return esame;
    }
    public int getVoto(){
        return this.voto;
    }
}