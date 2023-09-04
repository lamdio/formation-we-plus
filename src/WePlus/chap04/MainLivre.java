package weplus.chap04;

public class MainLivre {
    public static void main(String[] args) {
        Livre liv1 = new Livre("Les Misérables", "Victor Hugo", 1803);
        liv1.afficheInfo();

        Livre liv2 = new Livre("La gloire de mon père", "Marcel Pagnol", 1921);
        liv2.afficheInfo();

        Livre liv3 = new Livre("Gouverneur de la rosée", "Aimée Césaire", 1955);
        liv3.afficheInfo();
    }
}
