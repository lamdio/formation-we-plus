package weplus.chap03;

public class ExoTableMultiplication {
	
	private int nombre;
	
	public ExoTableMultiplication(int n) {
		nombre = n;
		String lntable;
		String table = "";
		
		for(int i = 1; i <= 10; i++) {
			lntable =  nombre + "x " + i + " = " + nombre * i ;
			table +=  lntable + "\n"; 
			
			if (i == 10) {
				javax.swing.JOptionPane.showMessageDialog(null, "Table de multipilcation de "
						+ nombre + " : \n" + table);
			}
		}
	}
}
