package weplus.chap04;

public class MainProduit {
    public static void main(String[] args) {
        weplus.chap04.Produit p1 = new weplus.chap04.Produit();
        p1.afficheProduit();

        weplus.chap04.Produit p2 = new weplus.chap04.Produit("Pelle", 26f, 100);
        p2.afficheProduit();

        weplus.chap04.Produit p3 = new weplus.chap04.Produit(p2);
        p3.afficheProduit();
    }
}
