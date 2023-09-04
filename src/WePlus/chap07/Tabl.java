package weplus.chap07;

public class Tabl {
    public static void main(String args[]) {
        // Déclaration d'un tableau d'entiers
/*        int tableauEntiers[];

        // Initialisation d'un tableau d'entiers
        tableauEntiers = new int[5];
        tableauEntiers[0] = 10;
        tableauEntiers[1] = 20;
        tableauEntiers[2] = 30;
        tableauEntiers[3] = 40;
        tableauEntiers[4] = 50;

        for (int element : tableauEntiers) {
            System.out.println(element);
        }

        // Méthode length
        int length = tableauEntiers.length;
        System.out.println("Longueur du tableau numbers : " + length);

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 4, 5};
        // Méthode toString()
        String arr1String = Arrays.toString(arr1);
        System.out.println("Représentation sous forme de chaîne du tableau arr1 : " + arr1String);
        // Méthode equals()
        boolean areEqual = Arrays.equals(arr1, arr2);
        System.out.println("Les tableaux arr1 et arr2 sont-ils égaux ? " + areEqual);
        // Méthode fill()
        int arr3[] = new int[5];
        Arrays.fill(arr3, 7);
        System.out.println("Tableau arr3 rempli avec la valeur 7 : " + Arrays.toString(arr3));
        // Méthode sort()
        int arr4[] = {5, 2, 9, 1, 7};
        System.out.print("Tableau arr4 : " + Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.print(" trié devient : " + Arrays.toString(arr4));
*/
        //two rows and three columns
        int arr[][] = {{11, 22, 33}, {44, 55, 66}};

        //outer loop from 0 till number of rows
        for (int i = 0; i < 2; i++) {
            //inner loop from 0 till number of columns
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            //new line after each row
            System.out.println();
        }

 /*
        int tab[][] = new int[10][20]; //tableau de 10 lignes, 20 colonnes
        System.out.println(tab.length); //nbre lignes du tableau
        System.out.println(tab[5].length); // nbre colonnes de la cinquième ligne
*/
    }
}
