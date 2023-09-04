package Afcepf;
import java.util.*;
public class Dte {
    private int jour, mois, annee;
    Calendar now = Calendar.getInstance();
    //Dte today = new Dte();
    private String appel;

    public Dte() {
        jour = now.get(Calendar.DAY_OF_MONTH);
        mois = now.get(Calendar.MONTH)+1;
        annee = now.get(Calendar.YEAR);

		/*jour = today.getDay();
		mois = today.getMonth();
		annee = today.getYear();*/
        appel = "Dte()";
    }

    public Dte(int j) {
        this();
        jour = j;
		/*mois = now.get(Calendar.MONTH)+1;
		annee = now.get(Calendar.YEAR);*/
        appel = "Appel Dte(int j)";
    }

    public Dte(int j, int m) {
        this();
        jour = j;
        mois = m;
        //annee = now.get(Calendar.YEAR);
        appel = "Appel Dte(int j, int m)";
    }

    public Dte(int j, int m, int a) {
        jour = j;
        mois = m;
        annee = a;
        appel = "Appel Dte(int j, int m, int a)";
    }

    public Dte(Dte d) {
        this(d.jour, d.mois, d.annee);
        appel = "Appel Dte(Dte d)";
    }

    public Dte(String s) {
        int sep1 = s.indexOf('/');
        int sep2 = s.indexOf('/', sep1 + 1);
        jour = Integer.parseInt(s.substring(0, sep1));
        mois = Integer.parseInt(s.substring(sep1 + 1, sep2));
        annee = Integer.parseInt(s.substring(sep2 + 1));
        appel = "Appel Dte(String s)";
    }

    public void affiche() {
        System.out.println(appel + " : " + jour + "/" + mois + "/" + annee);
    }

    public void fenetreMessage() {
        javax.swing.JOptionPane.showMessageDialog(null, appel + " : " + jour + "/" + mois + "/" + annee);
    }

    //@Override
    public String toString() {
        //return "Dte: \n - jour = "+ jour +"\n - mois = "+mois+"\n Année = "+annee;
        if (jour < 9)
        {if (mois < 9)
        {return "0" + jour + "/" + "0" + mois + "/" + annee;}
        else
        {return "0" + jour + "/" + mois + "/" + annee;}
        }
        else
        {if (mois < 9)
        {return jour + "/" + "0" + mois + "/" + annee;}
        else
        {return jour + "/" + mois + "/" + annee;}
        }
    }
}
