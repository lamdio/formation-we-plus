package Afcepf;

public class Etudiant extends Individu{
    int numero, etude;

    Etudiant(String n, String p, Dte d, int num, int etu) {
        super(n, p, d);
        numero = num;
        etude = etu;
    }

    public void affNumero() {
        javax.swing.JOptionPane.showMessageDialog(null, "numéro : " + numero);
    }

    public void affEtude() {
        javax.swing.JOptionPane.showMessageDialog(null, "étude : " + etude);
    }

    public void affiche() {
		/*super.affiche();
		javax.swing.JOptionPane.showMessageDialog(null, "numéro : " + numero + "\nétude : " + etude);*/
        javax.swing.JOptionPane.showMessageDialog(null, super.toString() + "\nnuméro : " + numero + "\nétude : " + etude);
        //javax.swing.JOptionPane.showMessageDialog(null, super.affiche() + "\nnuméro : " + numero + "\nétude : " + etude);
    }
}
