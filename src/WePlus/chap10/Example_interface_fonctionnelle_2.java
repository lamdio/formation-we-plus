package WePlus.chap10;

import java.util.function.IntBinaryOperator;
/*@FunctionalInterface
interface MyFunctionalInterface {
    public int addMethod(int a, int b);
}
 */
public class Example_interface_fonctionnelle_2 {

    public static void main(String args[]) {
        // lambda expression
        /*MyFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.addMethod(12, 100));
         */
        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(12, 100));
    }
}
