package Overiding;

public class Animals {
	String name;
	
	public Animals(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
	
	public void makeNoise() {
		javax.swing.JOptionPane.showMessageDialog(null, getName()+" "+"noise");
	}
}
