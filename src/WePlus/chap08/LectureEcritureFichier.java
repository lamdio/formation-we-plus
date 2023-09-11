package WePlus.chap08;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.lang.Class.*;

public class LectureEcritureFichier {
    public static void main(String args[]) {

        ArrayList<Individu> lind = new ArrayList<>(); //Liste

        /***Lecture fichier***/
        try {
            File fichier = new File("c:/Users/ldio/Formation_We+/Java/test_lecture.txt");
            FileReader lecteur = new FileReader(fichier);
            BufferedReader buffer = new BufferedReader(lecteur);
            //Individu ind = new Individu(); //création d'un seul objet mis à jour à chaque passage dans la boucle.
                                            //dernier enregistrement lu à la sortie de la boucle.
            String ligne;
            int numLigne = 1;
            //ArrayList<Individu> lind = new ArrayList<>();
            //ListeIndividu lind = new ListeIndividu();

            System.out.println("------------------------Affichage lignes du fichier en entrée : \n");

            while ((ligne = buffer.readLine()) != null) {
                if (numLigne > 1) {
                    Individu ind = new Individu(); //création d'autant d'objets que de lignes.
                    System.out.println("ligne numéro : " + numLigne);
                    System.out.println(ligne);
                    String col[] = ligne.split("#");
                    fillIndividu(ind, col);
                    System.out.println(ind.toString());
                    lind.add(ind);//stockage dans la liste des références d'objets crées à chaque itération.
                }
                numLigne++;
            }

            buffer.close();
            lecteur.close();

            System.out.println("\n------------------------Affichage lignes stockées dans la liste : ");

            for (Individu element : lind) {
                System.out.println("\n" + element.toString());
            }
        }catch(IOException e) {
               e.printStackTrace();
        }

        /***Ecriture fichier : Listing***/
        try {
            File fichier = new File("c:/Users/ldio/Formation_We+/Java/test_ecriture.txt");
            FileWriter ecrivain = new FileWriter(fichier/*, true*/);
            BufferedWriter buffer = new BufferedWriter(ecrivain);

            /*buffer.write("ajout, Java File Handling!");
            buffer.newLine(); //Nouvelle ligne
            buffer.append("Fin de l'ajout.");*/

            for (Individu element : lind) {
                buffer.write(element.toString());
                buffer.newLine(); //Nouvelle ligne
                buffer.write("-----------------------------------------------");
                buffer.newLine(); //Nouvelle ligne
            }

            buffer.close();
            ecrivain.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /***Ecriture fichier : nouveau format***/
        try {
            File fichier = new File("c:/Users/ldio/Formation_We+/Java/test_ecriture1.txt");
            FileWriter ecrivain = new FileWriter(fichier/*, true*/);
            BufferedWriter buffer = new BufferedWriter(ecrivain);

            for (Individu element : lind) {
                buffer.write(element.getNom() + "!" +
                             element.getPrenom() + "!" +
                             element.getDateNaissance() + "!" +
                             element.getAdresse() + "!" +
                             element.getComplement() + "!" +
                             element.getCodePostal() + "!" +
                             element.getVille()
                            );
                buffer.newLine(); //Nouvelle ligne
            }

            buffer.close();
            ecrivain.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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