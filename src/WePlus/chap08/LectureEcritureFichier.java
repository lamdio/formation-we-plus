package WePlus.chap08;

import WePlus.chap08.Individu;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.io.IOException;

public class LectureEcritureFichier {
    public static void main(String args[]) {

        try {
            File fichier = new File("c:/Users/ldio/Formation_We+/Java/test_lecture.txt");
            FileReader lecteur = new FileReader(fichier);
            BufferedReader buffer = new BufferedReader(lecteur);
            //Individu ind = new Individu(); //création d'un seul objet.
            String ligne;
            
            int i = 1;
            ArrayList<Individu> lind = new ArrayList<>();
            //ListeIndividu lind = new ListeIndividu();

            System.out.println("------------------------Affichage lignes du fichier en entrée : \n");

            while ((ligne = buffer.readLine()) != null) {
                if (i > 1) {
                    Individu ind = new Individu(); //création d'autant d'objets que de lignes.
                    System.out.println("ligne : " + i);
                    System.out.println(ligne);
                    String col[] = ligne.split("#");
                    fillIndividu(ind, col);
                    System.out.println(ind.toString());
                    lind.add(ind);//stockage dans la liste des références d'objets crées à chaque itération.
                }
                i++;
            }

            buffer.close();
            lecteur.close();

            System.out.println("\n------------------------Affichage lignes stockées dans la liste : ");

            for (Individu element : lind) {
                System.out.println("\n" + element.toString());
            }


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

    private static void fillIndividu(Individu ind, String[] col) {
        ind.setNom(col[0]);
        ind.setPrenom(col[1]);
        ind.setDateNaissance(col[2]);
        ind.setAdresse(col[3]);
        ind.setComplement(col[4]);
        ind.setCodePostal(col[5]);
        ind.setVille(col[6]);
    }
}