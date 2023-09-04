package Overiding;

public class Cat extends Animals {
	public Cat(String name) {
		super(name);
	}

	public void affiche() {
		super.makeNoise();
	}
	
	@Override
	public void makeNoise() {
		javax.swing.JOptionPane.showMessageDialog(null, super.name+" Miaou");
	}
}
