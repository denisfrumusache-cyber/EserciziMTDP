package it.unicam.mdp2526.universita.SistemaUniversitario.Contratti;

import it.unicam.mdp2526.universita.SistemaUniversitario.ClassiPrincipali.Studente;

public interface GestoreUniversitario {
    int calcolaMedia();
    void stampaEsamiSuperati(Studente studente);
    int assegnaVoto(Studente studente);
    void iscriviStudente(Studente studente);
    void approvaPianoDiStudi(Studente studente);
}