package it.unicam.mdp2526.universita.SistemaUniversitario;

import java.util.Random;


@SuppressWarnings("All")
public class Professore extends Persona implements Valutatore {
    private String nome;
    private String cognome;
    private String settore;

    public Professore(String nome, String cognome, String settore) {
        super(nome, cognome);
        this.settore = settore;
    }
    @Override
    public String getNome(){
        return this.nome;
    }
    @Override
    public String getCognome(){
        return this.cognome;
    }

    @Override
    public String getNomeCompleto() {
        return this.nome + " " + this.cognome;
    }

    @Override
    public int assegnaVoto(Studente studente) {
        Random random = new Random();
        return random.nextInt(31);
    }
    @Override
    public void presentati(){
        System.out.print("Ciao, sono " );

    }
}

