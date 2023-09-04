package weplus.chap03;

import java.util.Scanner;

public class SolExoJoursSemaine {	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un numéro de jour (1-7) : ");
        int dayNumber = scanner.nextInt();
        String dayName;        
        
        switch (dayNumber) {
            case 1: dayName = "Lundi";
                	break;
            case 2: dayName = "Mardi";
                	break;
            case 3: dayName = "Mercredi"; 
               		break;
            case 4: dayName = "Jeudi"; 
            		break;            
	        case 5: dayName = "Vendredi";
	            	break;           
	        case 6: dayName = "Samedi";
	             	break;
	        case 7: dayName = "Dimanche";
	             	break;            
	        default: dayName = "Jour invalide";
             		break;        } 
        
        System.out.println("Le jour correspondant est : " + dayName);    
		}
}
