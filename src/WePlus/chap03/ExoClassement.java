package weplus.chap03;

public class ExoClassement {
	
	private final float note;
	
	public ExoClassement(float i) {
		note = i;
		
		if (note >= 18 && note <= 20 ) {
			javax.swing.JOptionPane.showMessageDialog(null,"Note : "+ note +" -> Excellent ");
		 
		}
		else if (note >= 16 && note < 18) {
			javax.swing.JOptionPane.showMessageDialog(null,"Note : "+ note +" -> Très bien ");
		}
		else if (note >= 12 && note < 14) {
			javax.swing.JOptionPane.showMessageDialog(null,"Note : "+ note +" -> Bien ");
		}
		else if (note >= 0 && note < 12) {
			javax.swing.JOptionPane.showMessageDialog(null,"Note : "+ note +" -> Insuffisant ");
		}
		else {
			javax.swing.JOptionPane.showMessageDialog(null,"Note : "+ note +" -> Note en dehors de la plage 0 à 20 ");
		}
	}

}
