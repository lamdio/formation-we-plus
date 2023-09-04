package weplus.chap05;

public class D extends C {
    private int j = 0;
    public D() {
        j = 1;
    }
    @Override
    public void f() {
        super.f();
        System.out.println(" - j = " + j);
    }
}
