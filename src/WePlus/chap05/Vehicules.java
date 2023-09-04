package weplus.chap05;

public class Vehicules {
    private final String couleur;
    public Vehicules (String c) {
        couleur = c;
    }
    public void AfficheVehicules () {
        System.out.println("Couleur véhicule : " + couleur);
    }
}
