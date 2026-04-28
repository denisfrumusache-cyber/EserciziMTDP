package it.unicam.mdp2526.universita.SistemaUniversitario.ClassiPrincipali;

import it.unicam.mdp2526.universita.Utils.EsameSuperato;

import java.util.ArrayList;
import java.util.List;

import static it.unicam.mdp2526.universita.Utils.FormattatoreVoto.formatta;

public class Libretto{

        private final Studente studente;
        private final List<EsameSuperato> esamiSuperati = new ArrayList<>();

        public Libretto(Studente studente) {
            if (studente == null) {
                throw new IllegalArgumentException("Studente non valido");
            }
            this.studente = studente;
        }

        public void registraEsameSuperato(Esame esame, int voto) {
            EsameSuperato esamePassed = new EsameSuperato(esame, voto);
            esamiSuperati.add(esamePassed);
        }

        public int calcolaMedia() {
            if (esamiSuperati.isEmpty()) {
                return 0;
            }

            int somma = 0;
            for (EsameSuperato esame : esamiSuperati) {
                somma += (esame.getVoto() == 31) ? 30 : esame.getVoto();
            }

            return  somma / esamiSuperati.size();
        }

        public boolean puoLaurearsi() {
            return esamiSuperati.size() >= 20 && calcolaMedia() >= 24.0;
        }

        @SuppressWarnings("all")
        public void stampaEsamiSuperati() {
            System.out.println("Libretto di " + studente.getNomeCompleto());
            for (int i = 0; i < esamiSuperati.size(); i++) {
                String votoString = formatta(esamiSuperati.get(i).getVoto());
                System.out.println(esamiSuperati.get(i).getEsame().getNome() + " - " + votoString);
            }
        }


}
