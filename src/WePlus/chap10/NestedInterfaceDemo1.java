package WePlus.chap10;

//******Example 1: Nested interface declared inside another interface
interface MyInterfaceA {
    void display();
    interface MyInterfaceB {
        void myMethod();
    }
}
class NestedInterfaceDemo1 implements MyInterfaceA/*.MyInterfaceB*/ {
    public void display() {
        System.out.println("InterfaceA methode display");
    }
    public void myMethod() {
        System.out.println("Nested interfaceB method inside interfaceA");
    }
    public static void main(String args[]) {
        /*MyInterfaceA.MyInterfaceB obj = new NestedInterfaceDemo1();
        obj.myMethod();*/

        MyInterfaceA obj1 = new NestedInterfaceDemo1();
        obj1.display();
    }
}
