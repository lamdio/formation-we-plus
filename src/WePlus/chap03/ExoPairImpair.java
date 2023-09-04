package weplus.chap03;

public class ExoPairImpair {

		private int nbr;
		
		public ExoPairImpair (int i){
			nbr = i;
			
			if(nbr%2 == 0) {
				javax.swing.JOptionPane.showMessageDialog(null,"Le nombre : "+ nbr +" est pair ");
			}
			else {
				javax.swing.JOptionPane.showMessageDialog(null,"Le nombre : "+ nbr +" est impair ");
			}
		}


}
