package it.unicam.mdp2526.universita.SistemaUniversitario;

import java.util.ArrayList;

@SuppressWarnings("All")
public class Commissione implements Valutatore {
   private ArrayList<Valutatore> valutatori;

   public Commissione(){
       valutatori = new ArrayList<>();
   }

   /*
   * Ogni prof che fa parte della commisione assegna allo studente un voto.
   * Il voto finale è la media totale dei voti
   */

   @Override
   public int assegnaVoto(Studente studente){
       int totVoti = 0;

       for (Valutatore prof : valutatori){
           totVoti += prof.assegnaVoto(studente);
       }
       return totVoti/valutatori.size();
   }


   public ArrayList<Valutatore> getProfessori(){
       return this.valutatori;
   }



}
