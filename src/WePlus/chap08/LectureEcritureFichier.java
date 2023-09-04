package weplus.chap08;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class LectureEcritureFichier {
    public static void main(String[] args) {
        try {
            File fichier = new File("c:/Users/ldio/Formation_We+/Java/test_lecture.txt");
            FileReader lecteur = new FileReader(fichier);
            BufferedReader buffer = new BufferedReader(lecteur);

            String ligne;
            while ((ligne = buffer.readLine()) != null) {
                System.out.println(ligne);
            }
            buffer.close();
            lecteur.close();
        }
        catch(IOException e){
               e.printStackTrace();
        }

        try {
            File fichier = new File("c:/Users/ldio/Formation_We+/Java/test_ecriture.txt");
            FileWriter ecrivain = new FileWriter(fichier);
            BufferedWriter buffer = new BufferedWriter(ecrivain);

            buffer.write("Hello, Java File Handling!");
            buffer.newLine(); //Nouvelle ligne
            buffer.write("Fin de lécriture.");

            buffer.close();
            ecrivain.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File fichier = new File("c:/Users/ldio/Formation_We+/Java/test_ecriture.txt");
            FileWriter ecrivain = new FileWriter(fichier, true);
            BufferedWriter buffer = new BufferedWriter(ecrivain);

            buffer.write("ajout, Java File Handling!");
            buffer.newLine(); //Nouvelle ligne
            buffer.append("Fin de l'ajout.");

            buffer.close();
            ecrivain.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}