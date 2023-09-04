package weplus.chap03;

//import javax.swing.JOptionPane;

import weplus.chap03.ExoDeviner;

public class MainControlFlow {

	public static void main(String[] args) {
		
		/*Vérification de la parité d'un nombre en entrée*/
		//new ExoPairImpair(Integer.parseInt(JOptionPane.showInputDialog("Saisir un nombre entier pour vérification de sa parité" )));
		
		/*Classement des notes*/
		//new ExoClassement(Float.parseFloat(JOptionPane.showInputDialog("Saisir une note entre 0 et 20" )));
		
		/*Calcul des jours de la semaine*/
		//new ExoJoursSemaine(Integer.parseInt(JOptionPane.showInputDialog("Saisir un jour compris entre 1 et 7" )));
		
		/*Affichage table de multiplication*/
		//new ExoTableMultiplication(Integer.parseInt(JOptionPane.showInputDialog("Saisir un nombre entier" )));
		
		/*Affichage du calcul de la somme des nombres pairs de 1 à 100*/
		//new ExoSommeNbrPairs();
		
		/*Affichage essais suppositions valeur du nombre de 1 à 100 généré aléatoirement*/
		new ExoDeviner((int)(Math.random()* 100));
	}
}
