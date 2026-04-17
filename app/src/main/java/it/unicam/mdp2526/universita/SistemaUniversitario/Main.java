package it.unicam.mdp2526.universita.SistemaUniversitario;

public class Main {
    public static void main(String[] args) {
        Professore p1 = new Professore("Fabrizio","Fornari","Informatica");
        Professore p2 = new Professore("Michele","Loreti","Informatica");
        Professore p3 = new Professore("Rosario","Culmone","Informatica");
        Studente s1 = new Studente("Denis", "Frumusache", 134556);
        Commissione c1 = new Commissione();
        c1.getProfessori().add(p1);
        c1.getProfessori().add(p2);
        c1.getProfessori().add(p3);
        Esame e1 = new Esame("Metodologie di Programmazione",c1);
        e1.sostieniEsame(s1);
    }



}
