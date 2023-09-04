package weplus.chap06;

public class CompteBancaire  {
    private float solde;
    public CompteBancaire(float s) {
        solde = s;
    }
    void retirer(float retrait) throws weplus.chap06.SoldeException {
        System.out.print("Retrait : " + retrait + " -> ");
        if(solde < retrait) {
            throw new weplus.chap06.SoldeException("Solde : "+ solde+ " Insuffisant pour un retrait de " + retrait);
        }
        solde = solde - retrait;
    }
    void afficheSolde() {
        System.out.println("Solde : " + solde);
    }
}
