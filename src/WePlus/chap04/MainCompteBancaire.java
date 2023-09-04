package weplus.chap04;

public class MainCompteBancaire {
    public static void main(String[] args) {
        weplus.chap04.CompteBancaire cpt1 = new weplus.chap04.CompteBancaire("Mr Dupond");
        cpt1.afficheSolde();
        cpt1.deposer(1500);
        cpt1.afficheSolde();
        cpt1.retrait(120);
        cpt1.afficheSolde();
        cpt1.retrait(2000);
        cpt1.afficheSolde();
        cpt1.retrait(2000);
        cpt1.afficheSolde();
        cpt1.retrait(1000);
        cpt1.afficheSolde();
    }
}
