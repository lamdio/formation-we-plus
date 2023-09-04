package weplus.chap05;

public class MainVehicules {
    public static void main (String[] args) {
/*
        Vehicules v1 = new Vehicules("bleu");
        v1.AfficheVehicules();

        Voitures vt1 = new Voitures("jaune", 5);
        vt1.AfficheVehicules();

        Motos mt1 = new Motos("blanc", 3);
        mt1.afficheMotos();

        Vehicules mamoto = new Motos("Shag shag", 3);
        mamoto.AfficheVehicules();
        if (mamoto instanceof Motos) {
            ((Motos)mamoto).afficheMotos();
        }

       Vehicules mavoiture = new Voitures("gris clair", 5);
        //mavoiture.AfficheVehicules();
        ((Vehicules)mavoiture).AfficheVehicules();
*/
       weplus.chap05.Vehicules savoiture = new weplus.chap05.Voitures("anthracite", 3);
        ((weplus.chap05.Vehicules)savoiture).AfficheVehicules();

    }
}
