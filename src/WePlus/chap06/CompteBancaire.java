package weplus.chap06;

public class CompteBancaire  {
    private float solde;
    public CompteBancaire(float s) {
        solde = s;
    }
    void retirer(float retrait) throws SoldeException {
        System.out.print("Retrait : " + retrait + " -> ");
        if(solde < retrait) {
            throw new SoldeException("Solde : "+ solde+ " Insuffisant pour un retrait de " + retrait);
        }
        solde = solde - retrait;
    }
    void afficheSolde() {
        System.out.println("Solde : " + solde);
    }
}
