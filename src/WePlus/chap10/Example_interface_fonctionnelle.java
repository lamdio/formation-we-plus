package WePlus.chap10;

//******Example 1: Java Lambda Expression with no parameter
/*@FunctionalInterface
interface MyFunctionalInterface {
    //A method with no parameter
    public String sayHello();
}
public class Example_interface_fonctionnelle {

    public static void main(String args[]) {
        // lambda expression
        MyFunctionalInterface msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());
    }
}
*/

//******Example 2: Java Lambda Expression with single parameter
/*@FunctionalInterface
interface MyFunctionalInterface {
    //A method with single parameter
    public int incrementByFive(int a);
}
public class Example_interface_fonctionnelle {
    public static void main(String args[]) {
        // lambda expression with single parameter num
        MyFunctionalInterface f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
    }
}
*/

import java.awt.*;
import java.awt.event.*;
public class Example_interface_fonctionnelle {
    public static void main(String[] args) {
        Frame frame=new Frame("ActionListener Before Java8");

        Button b=new Button("Click Here");
        b.setBounds(50,100,80,50);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Hello World!");
            }
        });
        frame.add(b);

        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

/*import java.awt.*;
public class Example_interface_fonctionnelle {
    public static void main(String[] args) {
        Frame frame=new Frame("ActionListener java8");

        Button b=new Button("Click Here");
        b.setBounds(50,100,80,50);

        b.addActionListener(e -> System.out.println("Hello World!"));
        frame.add(b);

        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
*/