package Overiding;

public class Dog extends Animals {
	public Dog(String name) {
		super(name);
	}

	public void makeNoise() {
		super.makeNoise();
	}
	
	/*@Override
	public void makeNoise() {
		javax.swing.JOptionPane.showMessageDialog(null, super.name+" waf");
	}*/
	
}
