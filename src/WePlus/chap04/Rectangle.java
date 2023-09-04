package weplus.chap04;

public class Rectangle {
    private float Largeur;
    private Float Hauteur;
    private Float Perimetre;
    private Float Superficie;
    public Rectangle(Float l, Float h) {
        Largeur = l;
        Hauteur = h;
    }
    public void CalculPerimetre() {
        Perimetre = (Largeur + Hauteur) * 2;
    }
    public void CalculSuperficie() {
        Superficie = Largeur * Hauteur;
    }
    public void afficheCaracteristique() {
        javax.swing.JOptionPane.showMessageDialog(null, "Dimensions rectangle : " +
                "\nLargeur : " + Largeur + "m\nHauteur : " + Hauteur + "m\nPérimetre : " +
                Perimetre + "m"+ "\nSuperficie : " + Superficie + "m²");
    }
}
