package WePlus.chap10;

//******Example 2: Nested interface declared inside a class
class Myclass {
    interface MyInterfaceC{
        void myMethod();
    }
}

public class NestedInterfaceDemo2  implements Myclass.MyInterfaceC {
    public void myMethod() {
        System.out.println("Nested interface method inside class");
    }
    public static void main(String args[]) {
        Myclass.MyInterfaceC obj = new NestedInterfaceDemo2();
        obj.myMethod();
    }
}
