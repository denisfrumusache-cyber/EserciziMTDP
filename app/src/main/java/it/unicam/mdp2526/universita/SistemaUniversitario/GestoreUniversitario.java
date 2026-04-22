package it.unicam.mdp2526.universita.SistemaUniversitario;

public interface GestoreUniversitario {
    int calcolaMedia();

    void stampaEsamiSuperati(Studente studente);

    int assegnaVoto(Studente studente);

    void iscriviStudente(Studente studente);
}