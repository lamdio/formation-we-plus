package WePlus.chap02;

public class MainTruc {
    public static void main(String[] args) {
        Truc.var++;
        System.out.println(Truc.var);
        Truc t = new Truc();
        t.foo();
        System.out.println(Truc.var);
    }
}
