package weplus.chap06;

public class MainCompteBancaire {
    public static void main(String[] args) {

        CompteBancaire c1 = new CompteBancaire(1200);
        c1.afficheSolde();

        try {
            c1.retirer(1000);
        }catch(SoldeException e) {
            System.out.println(e.getMessage());
             //throw new RuntimeException(e);
        }finally {
            c1.afficheSolde();
        }

        try {
            c1.retirer(500);
        }catch(SoldeException e) {
            System.out.println(e.getMessage());
         //throw new RuntimeException(e);
        }finally {
            c1.afficheSolde();
        }
    }
}
