package it.unicam.mdp2526.universita.SistemaUniversitario.ClassiPrincipali;


import it.unicam.mdp2526.universita.SistemaUniversitario.Contratti.Valutatore;

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
        stampaEsito(studente, voto);
        if (esameSuperato(voto)){
            registraEsito(studente, voto);
        }else{
            stampaEsameNonSuperato();
        }
    }

    public void stampaEsito(Studente studente, int voto){
        System.out.println("Esame superato e registrato nel libretto.");
        System.out.println("Esame non superato, nessuna registrazione nel libretto");
        System.out.println("Voto assegnato: " + voto);
    }

    public boolean esameSuperato(int voto){
        if (voto >= 18 && voto <= 30 || voto == 31){
            return true;
        }else{
            return false;
        }
    }
    public void registraEsito(Studente studente,int voto){
        studente.getLibretto().registraEsameSuperato(this,voto);
    }

    public String getNome(){
        return this.nome;
    }
    public void stampaEsameNonSuperato(){
        System.out.println("Ci dispiace, non hai superato l'esame");

    }
}
