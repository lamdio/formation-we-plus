package weplus.chap04;

public class MainRectangle {
    public static void main(String[] args) {
        weplus.chap04.Rectangle rect1 = new weplus.chap04.Rectangle(10.0f, 20.0f);
        rect1.CalculPerimetre();
        rect1.CalculSuperficie();
        rect1.afficheCaracteristique();

        weplus.chap04.Rectangle rect2 = new weplus.chap04.Rectangle(1025.45f, 345.78f);
        rect2.CalculPerimetre();
        rect2.CalculSuperficie();
        rect2.afficheCaracteristique();

        weplus.chap04.Rectangle rect3 = new weplus.chap04.Rectangle(102.23f, 654.87f);
        rect3.CalculPerimetre();
        rect3.CalculSuperficie();
        rect3.afficheCaracteristique();
    }
}
