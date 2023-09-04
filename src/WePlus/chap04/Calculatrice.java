package weplus.chap04;

/*public class Calculatrice {
    private float valeur1 = 0f;
    private float valeur2 = 0f;
    private float resultat = 0f;
    private char operation;

    public Calculatrice(float v1, float v2) {
        valeur1 = v1;
        valeur2 = v2;
    }

    public void addition() {
        operation = 'a';
        resultat = valeur1 + valeur2;
    }

    public void soustraction() {
        operation = 's';
        resultat = valeur1 - valeur2;
    }

    public void multiplication() {
        operation = 'm';
        resultat = valeur1 * valeur2;
    }

    public void division() {
        operation = 'd';
        if (valeur2 != 0) {
            resultat = valeur1 / valeur2;
        } else {
            operation = 'f';
        }
    }

    public void affiche() {
        switch (operation) {
            case 'a':
                System.out.println("L'addition  de : " + valeur1 + " et " + valeur2 + " donne " + resultat);
                break;
            case 's':
                System.out.println("La soustraction de : " + valeur1 + " et " + valeur2 + " donne " + resultat);
                break;
            case 'm':
                System.out.println("La multiplication de : " + valeur1 + " et " + valeur2 + " donne " + resultat);
                break;
            case 'd':
                System.out.println("La division de : " + valeur1 + " et " + valeur2 + " donne " + resultat);
                break;
            case 'f':
                System.out.println("division par zéro impossible");
                break;

        }
    }
}

*/
public class Calculatrice {
    public int additionner(int a, int b) { return a + b;}
       public int soustraire(int a, int b) {return a - b;}
       public int multiplier(int a, int b) {return a * b;}
       public double diviser(double a, double b) {
            if (b != 0) {
                return a / b;        }
            else {
                throw new IllegalArgumentException("Division par zéro !");
            }
        }
public static void main(String[] args) {
       Calculatrice calc = new Calculatrice();
       System.out.println("Addition : " + calc.additionner(5, 3));
       System.out.println("Soustraction : " + calc.soustraire(10, 4));
       System.out.println("Multiplication : " + calc.multiplier(6, 2));
       try {
            System.out.println("Division : " + calc.diviser(10, 2));
            System.out.println("Division par zéro : " + calc.diviser(8, 0)); // Déclenchera une exception
       }
       catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());}
        }
}
