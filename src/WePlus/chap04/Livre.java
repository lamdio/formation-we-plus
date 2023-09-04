package weplus.chap04;

public class Livre {
    private final String titre;
    private final String auteur;
    private final int anneePublication;
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
