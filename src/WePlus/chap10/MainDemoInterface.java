package WePlus.chap10;

public class MainDemoInterface {
    public static void main(String args[]) {
        MyInterface obj1 = new DemoInterface();
        obj1.method2();
        obj1.method1();

        MyOtherInterface obj2 = new DemoInterface();
        obj2.method3();

        MyNewInterface obj3 = new DemoInterface();
        obj3.method3();
        obj3.method4();
    }
}
