package weplus.chap07;

public class NombresPairs {
    public static void main(String args[]) {
        int tab[] = new int[10];

        for (int i = 1; i <= 10; i++) {
            tab[i-1] = i * 2;
            System.out.println(tab[i-1]);
        }
        System.out.println();

        int[] nombresPairs = new int[10];

        for (int i = 0; i < 10; i++) {
            nombresPairs[i] = 2 * i;
        }

        for (int nombre : nombresPairs) {
            System.out.println(nombre);
        }

    }
}
