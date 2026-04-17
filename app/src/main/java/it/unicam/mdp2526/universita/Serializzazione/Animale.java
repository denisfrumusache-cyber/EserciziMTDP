package it.unicam.mdp2526.universita.Serializzazione;


import java.io.Serializable;

@SuppressWarnings("all")

public class Animale implements Serializable {
    private static final long serialVersionUID = 1L;
    private String specie;
    private String nome;
    private int anni;

    public Animale(String specie, String nome, int anni){
        this.specie = specie;
        this.nome = nome;
        this.anni = anni;
    }

    public String getNome(){ return this.nome;}
    public String getSpecie(){ return this.specie;}
    public int getAnni(){ return this.anni;}

    public void setNome(String nomeDaCambiare){ this.nome = nomeDaCambiare;}
    public void setSpecie(String specieDaCambiare){ this.specie = specieDaCambiare;}
    public void setAnni(int anniDaCambiare){ this.anni = anniDaCambiare;}

    @Override
    public String toString() {
        return "Specie: "+ this.getSpecie() + "\nNome: " + this.getNome() + "\nAnni: "+ this.getAnni();
    }
}




