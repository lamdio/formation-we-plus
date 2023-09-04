package weplus.chap07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collect {
    public static void main(String args[]) {
//*
        // Déclaration et initialisation d'une ArrayList d'entiers
        ArrayList<Integer> listeEntiers = new ArrayList<>();
        listeEntiers.add(10);
        listeEntiers.add(20);
        listeEntiers.add(30);

        // Accès et parcours de l'ArrayList
        int valeur = listeEntiers.get(1);
        // valeur sera 20
        //System.out.println(valeur);

        //for (int element : listeEntiers) {
        //    System.out.println(element);
            System.out.println("Liste : " + listeEntiers);
        //}
        listeEntiers.add(0, 60); //inserting element at first position, index 0
        listeEntiers.add(3, 100); //inserting element at first position, index 3

        //System.out.println();
        //for (int element : listeEntiers) {
        //    System.out.println(element);
            System.out.println("Liste mise à jour : " + listeEntiers);
        //}

        // Méthode set()
        listeEntiers.set(0, 15); //update de l'élément en première position, index 0
        System.out.println("Liste mise à jour : " + listeEntiers);

        // Méthode indexOf()
        int indexOf30 = listeEntiers.indexOf(30);
        System.out.println("Index de 30 : " + indexOf30);

        // Méthode lastIndexOf()
        listeEntiers.add(20);
        System.out.println("Liste mise à jour : " + listeEntiers);
        int lastIndexOf20 = listeEntiers.lastIndexOf(20);
        System.out.println("Dernier index de 20 : " + lastIndexOf20);

        // Méthode subList()
        List<Integer> subList = listeEntiers.subList(1, 3);
        System.out.println("Sous-liste : " + subList);

/*
        // Utilisation de l'interface Collection (commune à //toutes les collections)
        Collection<String> collect = new ArrayList<>();

        // Méthode add()
        collect.add("Apple");
        collect.add("Banana");
        collect.add("Orange");

        // Méthode size()
        int size = collect.size();
        System.out.println("Taille de la collection : " + size);

        for(String element : collect) {
            System.out.println(element);
        }

        // Méthode isEmpty()
        boolean isEmpty = collect.isEmpty();
        System.out.println("La collection est-elle vide ? " + isEmpty);
        // Méthode contains()
        boolean containsBanana = collect.contains("Banana");
        System.out.println("La collection contient 'Banana' ? " + containsBanana);

        // Méthode remove()
        collect.remove("Apple");

        for(String element : collect) {
            System.out.println(element);
        }

        // Méthode clear()
        collect.clear();
        System.out.println("Taille de la collection après avoir été vidée : " + collect.size());

 */
    }
}

