package Overiding;

public class MainApp {

	public static void main(String[] args) {
		
		/*Animals dog = new Animals("Médor");
		dog.makeNoise();*/
		
		/*Dog dog = new Dog("Wafi");
		//dog.makeNoise();
		dog.affiche();*/
		
		/*Cat cat = new Cat("felix");
		cat.makeNoise();*/
		
		Animals[] animals = new Animals[2];
		
		animals[0] = new Dog("Wafi");
		animals[1] = new Cat("felix");
		
		for (Animals a: animals) {
		//for (int i=0; i<2; i++){
			 //animals[i].makeNoise();
			a.makeNoise();
		}		
	}

}
