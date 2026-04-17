package it.unicam.mdp2526.universita.SistemaUniversitario;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("All")
public class Corso {
    private String nome;
    private Professore docente;
    private List<Studente> studentiIscritti;

    public Corso(String nome, Professore docente) {
        this.nome = nome;
        this.docente = docente;
        this.studentiIscritti = new ArrayList<>();
    }
    public boolean iscriviStudente(Studente studente) {
        return this.studentiIscritti.add(studente);
    }

    public void getStudentiIscritti(){
        System.out.println("Professore: " + this.docente.getNomeCompleto());
        for(Studente studente : studentiIscritti){
            System.out.println( "Studente: " + studente.getNomeCompleto());
        }
    }
}
