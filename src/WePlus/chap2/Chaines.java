package WePlus.chap2;

public class Chaines {
    public static void main(String[] args) {
        String fruits = "Apple, Banana, Orange";
        String[] fruitArray = fruits.split(", ");
        int i = 0;

        System.out.println("fruits : " + fruits + " -> " + fruits.length() + " caracteres\n");

        for (String a: fruitArray) {
            if (a.equals("Orange")) {break;}
            i++;
            System.out.println("fruit["+i+"]: " + a + " -> " + a.length() + " caracteres, commence par : " +
                    a.charAt(0) + " et fini par : " + a.charAt(a.length() - 1) + " en passant par : ");
            for (int j = 1; j < a.length() - 1; j++){
                System.out.println(a.charAt(j));
            }
        }

    }
}
