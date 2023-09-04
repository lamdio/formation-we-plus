package weplus.chap04;

public class MainLivre {
    public static void main(String[] args) {
        weplus.chap04.Livre liv1 = new weplus.chap04.Livre("Les Misérables", "Victor Hugo", 1803);
        liv1.afficheInfo();

        weplus.chap04.Livre liv2 = new weplus.chap04.Livre("La gloire de mon père", "Marcel Pagnol", 1921);
        liv2.afficheInfo();

        weplus.chap04.Livre liv3 = new weplus.chap04.Livre("Gouverneur de la rosée", "Aimée Césaire", 1955);
        liv3.afficheInfo();
    }
}
