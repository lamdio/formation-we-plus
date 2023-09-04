package weplus.chap04;

public class Produit {
    private String nom;
    private float prix;
    private int quantite;
    public Produit () {
        nom = "Produit à définir";
        prix = 0f;
        quantite = 0;
    }
    public Produit (String n, float p, int q) {
        nom = n;
        prix = p;
        quantite = q;
    }
    public Produit (float p, int q) {
        this();
        prix = p;
        quantite = q;
    }
    public Produit (String n) {
        this();
        nom = n;
    }
    public Produit(Produit p) {
        this(p.nom, p.prix, p.quantite);
    }
    public void afficheProduit() {
        javax.swing.JOptionPane.showMessageDialog(null,"Informations produit : " +
                "\nnom : " + nom + "\nprix : " + prix + "€\nquantité : " + quantite);
    }
}

/*
public class Produit {
    String nom;
    double prix;
    int quantite;
    public Produit(String n) {
        this.nom = n;    }
    public Produit(String n, double p) {
        this. nom = n;
        this. prix = p;    }
    public Produit(String n, double p, int q) {
        this. nom = n;
        this. prix = p;
        quantite = q;
    }
    public void afficherInfos() {
        System.out.println("Produit : " + nom);
        System.out.println("Prix : " + prix);
        System.out.println("Quantité : " + quantite);    }
    public static void main(String[] args) {
        Produit produit1 = new Produit("Livre");
        Produit produit2 = new Produit("T-shirt", 19.99);
        Produit produit3 = new Produit("Ordinateur", 799.99, 5);
        produit1.afficherInfos();        System.out.println("--------------------");
        produit2.afficherInfos();        System.out.println("--------------------");
        produit3.afficherInfos();    }
}
*/