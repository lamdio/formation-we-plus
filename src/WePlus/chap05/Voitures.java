package weplus.chap05;

public class Voitures  extends Vehicules {
    private int nbPortes;
    private String color;
        public Voitures ( String cl, int n) {
        super(cl);
        nbPortes = n;
    }
    @Override
    public void AfficheVehicules() {
        super.AfficheVehicules();
        System.out.println("Nombre de portes : " + nbPortes);
    }
}
