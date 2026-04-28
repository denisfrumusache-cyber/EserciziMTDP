package it.unicam.mdp2526.universita.SistemaUniversitario.Main;

import it.unicam.mdp2526.universita.SistemaUniversitario.ClassiPrincipali.Esame;
import it.unicam.mdp2526.universita.SistemaUniversitario.ClassiPrincipali.Professore;
import it.unicam.mdp2526.universita.SistemaUniversitario.ClassiPrincipali.Studente;
import it.unicam.mdp2526.universita.SistemaUniversitario.ClassiAstratte.Persona;

public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente("Luca","Corvatta",123456);
        Professore p1 = new Professore("Fabrizio","Fornari","Informatica");
        Professore p2 = new Professore("Michele","Loreti","Informatica");
        Persona p3 = new Professore("Rosario","Culmone","Informatica");
        Persona s1 = new Studente("Denis","Frumusache",123456);
        Esame M = new Esame("Matematica", p1);
        M.sostieniEsame(studente);

    }



}
