package weplus.chap07;

import java.util.ArrayList;

public class NombresImpair {
    public static void main(String args[]) {
        ArrayList<Integer> listeImpair = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listeImpair.add(i * 2 + 1);
        }
        System.out.println(listeImpair);

        ArrayList<Integer> impairs = new ArrayList<>();
        for (int i = 1; i <= 20; i += 2) {
            impairs.add(i);
        }
        for (int impair : impairs) {
            System.out.println(impair);
        }

        int valeur = 3;
        if(impairs.contains(valeur)) {
            System.out.print("La liste contient " + valeur);
        }else{
            System.out.print("La liste ne contient pas " + valeur);
        }
    }
}
