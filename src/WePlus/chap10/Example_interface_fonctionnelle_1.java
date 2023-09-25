package WePlus.chap10;

import java.util.*;
@FunctionalInterface
interface StringConcat {
    public String sconcat(String a, String b);
}
@FunctionalInterface
interface addFloat {
    public float fadd(float x, float y);
}
public class Example_interface_fonctionnelle_1 {
    public static void main(String args[]) {
        // lambda expression with multiple arguments
        StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: " + s.sconcat("Hello ", "World"));

        addFloat af = (f1, f2) -> f1 + f2;
        System.out.println("Result: " + af.fadd(42.3f, 12.7f));

        List<String> list = new ArrayList<String>();
        list.add("lolo");
        list.add("manu");
        list.add("gégé");
        list.add("bribri");
       /* for (int indice = 0; indice < list.size(); indice++) {
            System.out.println(list.get(indice));
        }*/
        System.out.println(list);
        list.forEach (
                //(names) -> System.out.println(names)
                System.out::println
        );

    }
}