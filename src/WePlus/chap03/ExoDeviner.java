package weplus.chap03;

import javax.swing.JOptionPane;

public class ExoDeviner {
	
	private int nombre;
	private int aleat;
	
	public ExoDeviner(int a) {		
		aleat = a;
		System.out.println("aleat : " + aleat);
		do {
			nombre = Integer.parseInt(JOptionPane.showInputDialog("Saisir le nombre entier de 1 à 100, généré aléatoirement" ));
			
			if (nombre > aleat) {
				javax.swing.JOptionPane.showMessageDialog(null, "nombre saisi : " + nombre + " supérieur au nombre aléatoire");
			}
			else if(nombre < aleat){
				javax.swing.JOptionPane.showMessageDialog(null, "nombre saisi : " + nombre + " inférieur au nombre aléatoire");
			}
			else {			
			javax.swing.JOptionPane.showMessageDialog(null, "nombre saisi : " + nombre + " égal au nombre aléatoire :" + aleat);
			}
		}
		while (nombre != aleat);
	}
}
