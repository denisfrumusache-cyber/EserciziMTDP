package it.unicam.mdp2526.universita.Serializzazione;

import java.io.*;
@SuppressWarnings("all")
public class esempioSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Mi creo un oggetto Animale
        Animale animale = new Animale("Cane","Husky",10);

        //ObjectOutputStream serve a convertire l'oggetto in byte
        ObjectOutputStream out = new ObjectOutputStream(
                //Creo il canale sul file anim.dat
                new BufferedOutputStream((new FileOutputStream("anim.dat"))));
        //scrivo l'oggetto sul file
        out.writeObject(animale);
        System.out.println("Oggetto serializzato con successo!");
        out.close();

        ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("anim.dat")));
        Animale animale1 = (Animale)in.readObject();
        System.out.println("Oggetto deserializzato con successo!");
         in.close();
         System.out.print(animale1.toString());



    }
}
