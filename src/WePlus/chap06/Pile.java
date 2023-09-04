package weplus.chap06;

public class Pile {
    private final int[] pile;
    private int sommet = 0;
    public static final String ERR_VIDE = "Pile est vide";
    public static final String ERR_PLEINE = "Pile est pleine";
    Pile(int taille) {
        pile = new int [taille];
        System.out.println("Taille pile : " + pile.length + "\n");
    }
    void empile(int val) throws weplus.chap06.PileSizeException {
        if(sommet >= pile.length) {
            throw new weplus.chap06.PileSizeException(ERR_PLEINE);
        }
        pile[sommet++] = val;
    }
    void  depile() throws weplus.chap06.PileSizeException {
        if(sommet < 1) {
            throw new weplus.chap06.PileSizeException(ERR_VIDE);
        }
        pile[--sommet] = 0;
    }
    void affiche() {
        int i = 0;
        for(int element: pile) {
            System.out.print("pile[" + i + "] = " + element);
            i++;
            if(i >= pile.length) {
                System.out.print("\n");
            }else{
                System.out.print(" - ");
            }

        }
    }
}
