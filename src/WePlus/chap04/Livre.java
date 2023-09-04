package weplus.chap04;

public class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;
    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }
    public void afficheInfo() {
        javax.swing.JOptionPane.showMessageDialog(null, "Information du livre : " +
                "\nTitre : " + titre + "\nAuteur : " + auteur + "\nAnnée publication : " + anneePublication);
    }
}
