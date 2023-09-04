package weplus.chap03;

public class ExoSommeNbrPairs {
	
	private int i = 2;
	private int s = 0;
	
	public ExoSommeNbrPairs() {		
		while(this.i <= 100) {						
			this.s += i;						
			if (this.i == 100) {
				javax.swing.JOptionPane.showMessageDialog(null, "La somme des nombres pair de 1 à 100 est : " + this.s);
			}			
			this.i += 2;
		}		
	}
}
