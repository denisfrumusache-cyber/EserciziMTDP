package it.unicam.mdp2526.universita.Persistenza;
import java.io.*;
import java.util.Scanner;

public class BufferReaderWriter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una numero: ");
        int numero = scanner.nextInt();
        double risultato = (double) numero/2;
        System.out.println("Il risultato è: " + risultato);
        //Salvo i'input inserito dal utente
        try(BufferedWriter scritto = new BufferedWriter(new FileWriter("storico.txt",true))){
            scritto.write("L'utente ha inserito: " + numero);
            scritto.newLine();
            System.out.println("Dato salvato con successo nello stream di output!");
        }catch (IOException e){
            System.err.println("Errore durante la scrittura del file: " + e.getMessage());
        }
        //Leggo gli input inseriti dal utente
        try(BufferedReader letto = new BufferedReader(new FileReader("storico.txt"))){
            String riga;
            System.out.println("Ecco il contenuto del file di log: ");
            while((riga = letto.readLine()) != null){
                System.out.println(riga);
            }
        }catch(IOException i){
            System.err.println("Errore durante la lettura del file: " + i.getMessage());

        }

    }
}
