package WePlus.chap08;

import WePlus.chap08.Individu;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class LectureEcritureFichier {
    public static void main(String args[]) {

        try {
            File fichier = new File("c:/Users/ldio/Formation_We+/Java/test_lecture.txt");
            FileReader lecteur = new FileReader(fichier);
            BufferedReader buffer = new BufferedReader(lecteur);

            String ligne;
            Individu ind = new Individu();
            int i = 0;

            while ((ligne = buffer.readLine()) != null) {
                if (i > 0) {
                    System.out.println("ligne : " + i);
                    System.out.println(ligne);
                    String col[] = ligne.split("#");
                    //Individu ind = new Individu();
                    ind.setNom(col[0]);
                    ind.setPrenom(col[1]);
                    ind.setDateNaissance(col[2]);
                    ind.setAdresse(col[3]);
                    ind.setComplement(col[4]);
                    ind.setCodePostal(col[5]);
                    ind.setVille(col[6]);
                    System.out.println(ind.toString());
                }
                i++;

            }
            buffer.close();
            lecteur.close();
        }
        catch(IOException e){
               e.printStackTrace();
        }
/*
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
 */
    }
}