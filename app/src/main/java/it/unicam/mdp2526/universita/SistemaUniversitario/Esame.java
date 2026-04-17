package it.unicam.mdp2526.universita.SistemaUniversitario;


@SuppressWarnings("All")
public class Esame {
    private String nome;
    private Valutatore valutatore;

    public Esame (String nome, Valutatore valutatore){
        this.nome = nome;
        this.valutatore = valutatore;
    }
    public void sostieniEsame (Studente studente){
        int voto = valutatore.assegnaVoto(studente);
        System.out.println("Voto assegnato: " + voto);
    }
}
