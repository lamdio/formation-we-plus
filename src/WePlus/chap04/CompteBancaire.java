package weplus.chap04;

public class CompteBancaire {
    private final float oldSolde = 2000f;
    private float newSolde = 0f;
    private final String titulaire;
    private float depot = 0f;
    private float retrait = 0f;
    private char operation;
    public CompteBancaire(String t) {
        titulaire = t;
        newSolde = oldSolde;
    }
    public void deposer(float d) {
        depot = d;
        newSolde = newSolde + depot;
        operation = 'd';
        //System.out.println("Solde : " + newSolde);
    }
    public void retrait(float r) {
        retrait = r;
        newSolde = newSolde - retrait;
        operation = 'r';
        System.out.println("Solde : "+ newSolde);
    }
    public void afficheSolde() {
        switch(operation) {
            case 'd': javax.swing.JOptionPane.showMessageDialog(null, "L'ancien solde de : " + (newSolde - depot) + "€, du compte de : " + titulaire + " est passé à : " + newSolde + "€");
                      break;
            case 'r': javax.swing.JOptionPane.showMessageDialog(null, "L'ancien solde de : " + (newSolde + retrait) + "€, du compte de : " + titulaire + " est passé à : " + newSolde + "€");
                      break;
        }
    }

}
