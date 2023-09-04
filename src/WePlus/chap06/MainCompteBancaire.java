package weplus.chap06;

public class MainCompteBancaire {
    public static void main(String[] args) {

        weplus.chap06.CompteBancaire c1 = new weplus.chap06.CompteBancaire(1200);
        c1.afficheSolde();

        try {
            c1.retirer(1000);
        }catch(weplus.chap06.SoldeException e) {
            System.out.println(e.getMessage());
             //throw new RuntimeException(e);
        }finally {
            c1.afficheSolde();
        }

        try {
            c1.retirer(500);
        }catch(weplus.chap06.SoldeException e) {
            System.out.println(e.getMessage());
         //throw new RuntimeException(e);
        }finally {
            c1.afficheSolde();
        }
    }
}
