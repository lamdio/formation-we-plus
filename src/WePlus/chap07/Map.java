package weplus.chap07;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        // Déclaration et initialisation d'une HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Eve", 22);

        // Accès et parcours de la HashMap
        int ageBob = map.get("Bob"); // ageBob sera 30

        // Parcours d’une HashMap
        for (String nom : map.keySet()) {
            int age = map.get(nom);
            System.out.println(nom + " à " + age + " ans");
        }
        System.out.println(map);

        //méthode containsKey() :
        if (map.containsKey("Eve")) {
            System.out.println("Eve existe dans la map.");
        }

        //Taille de la HashMap
        //La méthode size() vous permet de connaître le nombre d'éléments dans la HashMap :
        int taille = map.size();
        System.out.println("Taille de la map : " + taille);


        // Suppression de l'élément avec la clé "Bob"
        map.remove("Bob");
        System.out.println();
        for (String nom : map.keySet()) {
            int age = map.get(nom);
            System.out.println(nom + " à " + age + " ans");
        }
        System.out.println(map);
    }
}
