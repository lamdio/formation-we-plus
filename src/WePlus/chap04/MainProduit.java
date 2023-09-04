package weplus.chap04;

public class MainProduit {
    public static void main(String[] args) {
        Produit p1 = new Produit();
        p1.afficheProduit();

        Produit p2 = new Produit("Pelle", 26f, 100);
        p2.afficheProduit();

        Produit p3 = new Produit(p2);
        p3.afficheProduit();
    }
}
