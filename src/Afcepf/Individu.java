package Afcepf;

public class Individu {
    private String nom;
    private String prenom;
    private Dte naissance;

    public Individu(String n, String p, Dte d ) {
        nom = n; prenom = p; naissance = d;
    }

    public Individu(String n, String p) {
        nom = n; prenom = p;
    }

    public void affNom() {
        javax.swing.JOptionPane.showMessageDialog(null, "nom : " + nom);
    }

    public void affPrenom() {
        javax.swing.JOptionPane.showMessageDialog(null, "prenom : " + prenom);
    }

    public void affDate() {
        naissance.fenetreMessage();
    }

    public void affiche() {
        javax.swing.JOptionPane.showMessageDialog(null, "nom : " + nom + "\nprenom : " + prenom + "\nnaissance : " + naissance);
        //naissance.fenetreMessage();
    }

    @Override
    public String toString() {
        return "nom : " + nom + "\nprenom : " + prenom + "\nnaissance : " + naissance;
    }
}
