package WePlus.chap08;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

public class LectureEcritureStream {
    public static void main(String args[]) {
        try {
            FileInputStream fluxEntree = new FileInputStream("c:/Users/ldio/Formation_We+/Java/test_lecture.txt");
            //FileOutputStream fluxSortie = new FileOutputStream("c:/Users/ldio/Formation_We+/Java/test_ecriture1.txt");
            Scanner obj = new Scanner(fluxEntree);

            /*int octet;
            while ((octet = fluxEntree.read()) != -1) {
                //fluxSortie.write(octet);
            }*/

            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());
            }

            fluxEntree.close();
            //fluxSortie.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
