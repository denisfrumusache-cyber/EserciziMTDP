package it.unicam.mdp2526.universita.Utils;

public class FormattatoreVoto {
    public static String formatta(int voto){
        return (voto == 31)?"30 e lode" : String.valueOf(voto);
    }
}
