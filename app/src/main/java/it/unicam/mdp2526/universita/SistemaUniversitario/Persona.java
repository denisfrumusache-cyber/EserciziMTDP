package it.unicam.mdp2526.universita.SistemaUniversitario;

import java.io.Serializable;

public abstract class Persona implements Serializable {
    protected String nome;
    protected String cognome;


    public Persona (String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }

    public String getNomeCompleto(){
        return this.nome + " " + this.cognome;
    }
}
