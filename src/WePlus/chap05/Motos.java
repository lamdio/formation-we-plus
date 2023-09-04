package weplus.chap05;

public class Motos extends Vehicules {
    private int nbRoues;
    public Motos ( String cl, int r) {
        super(cl);
        nbRoues = r;
    }
    public void afficheMotos() {
        super.AfficheVehicules();
        System.out.println("Nombre de roues : " + nbRoues);
    }

}
