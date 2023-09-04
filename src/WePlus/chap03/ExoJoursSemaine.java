package weplus.chap03;

public class ExoJoursSemaine {
	
	private final int jour;
	
	public ExoJoursSemaine(int j) {
		jour = j;
		
	switch(jour) {
		case 1 : javax.swing.JOptionPane.showMessageDialog(null,"Jour : "+ jour +" -> Lundi");
				 break;
		case 2 : javax.swing.JOptionPane.showMessageDialog(null,"Jour : "+ jour +" -> Mardi");
		 		 break;
		case 3 : javax.swing.JOptionPane.showMessageDialog(null,"Jour : "+ jour +" -> Mercredi");
		 		 break;
		case 4 : javax.swing.JOptionPane.showMessageDialog(null,"Jour : "+ jour +" -> Jeudi");
		 		 break;
		case 5 : javax.swing.JOptionPane.showMessageDialog(null,"Jour : "+ jour +" -> Vendredi");
		 		 break;
		case 6 : javax.swing.JOptionPane.showMessageDialog(null,"Jour : "+ jour +" -> Samedi");
		 		 break;
		case 7: javax.swing.JOptionPane.showMessageDialog(null,"Jour : "+ jour +" -> Dimanche");
		 		break;
		default : javax.swing.JOptionPane.showMessageDialog(null,"Jour : "+ jour +" -> hors plage de valeur de 1 à 7");
 				  break;
	}
		
	}

}
