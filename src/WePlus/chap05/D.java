package weplus.chap05;

public class D extends weplus.chap05.C {
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
