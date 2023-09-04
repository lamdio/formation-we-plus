package Afcepf;

import Afcepf.Dte;

public class Programme {
    public static void main(String[] args) {

		/*Dte Dte1 = new Dte();
		Dte1.affiche();

		Dte Dte2 = new Dte(12);
		Dte2.affiche();

		Dte Dte3 = new Dte(01,01,2000);
		Dte3.affiche();

		//Dte Dte4 = new Dte(Dte2);
		Dte Dte4 = new Dte(new Dte(23, 12, 2022));
		Dte4.affiche();
		Dte4.fenetreMessage();

		/*Dte Dte5 = new Dte("03/08/2023");
		Dte5.fenetreMessage();*/

		/*System.out.println(new java.util.Dte().getDte());
		System.out.println(new java.util.Dte().getDay()-1);
		System.out.println(new java.util.Dte().getMonth()+1);
		System.out.println(new java.util.Dte().getYear()+1900);*/


        //Dte dtn = new Dte()/*31,01,1932)*/;
        //dtn.fenetreMessage();
        //Individu Ind1 = new Individu("Lee", "Bruce", dtn);


		/*Individu Ind1 = new Individu("Lee", "Bruce", new Dte(10,11,1952));
		//Ind1.affDate();
		Ind1.affiche();*/

        //Etudiant Et1 = new Etudiant("Bourne", "Jason", new Dte(04,03,1937), 123456789, 987654321);
		Etudiant Et1 = new Etudiant("Bourne", "Jason", new Dte("04/03/1937"), 123456789, 987654321);
		Et1.affiche();
    }

}
