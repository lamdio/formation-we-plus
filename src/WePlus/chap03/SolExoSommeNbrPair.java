package weplus.chap03;

public class SolExoSommeNbrPair {
	public static void main(String[] args) { 
	       int sum = 0;
	       int num = 2; // Premier nombre pair 
	       
	       while (num <= 100) { 
	           sum += num;
	           num += 2;
	           // Passer au prochain nombre pair        }
	           System.out.println("La somme des nombres pairs de 1 à 100 est : " + sum);  
	       }
	}
}
