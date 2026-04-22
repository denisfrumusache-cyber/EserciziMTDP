package it.unicam.mdp2526.universita.SistemaUniversitario;


@SuppressWarnings("All")
public class Studente extends Persona {
    private String nome;
    private String cognome;
    private final int matricola;
    private final Libretto libretto;

    public Studente(String nome, String cognome,int matricola) {
        super (nome,cognome);
        if (matricola < 100000 || matricola > 999999) {
            throw new IllegalArgumentException("Errore");
        }
        this.matricola = matricola;
        this.libretto = new Libretto(this);
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
    public Libretto getLibretto(){
        return this.libretto;
    }

    public void Saluta(){
        System.out.println("Ciao, come va?");
    }


    @Override
    public void presentati(){
        System.out.println("Ciao,sono " + this.getNomeCompleto());
    }

}
