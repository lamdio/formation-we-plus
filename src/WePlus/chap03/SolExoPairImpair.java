package weplus.chap03;

import java.util.Scanner;

public class SolExoPairImpair {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Entrez un nombre : ");
	    int number = scanner.nextInt();
	    
	    if (number % 2 == 0) { 
	           System.out.println(number + " est un nombre pair.");        
	    } 
	    else 
	    {System.out.println(number + " est un nombre impair.");}    
	}
}
