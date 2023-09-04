package weplus.chap04;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10.0f, 20.0f);
        rect1.CalculPerimetre();
        rect1.CalculSuperficie();
        rect1.afficheCaracteristique();

        Rectangle rect2 = new Rectangle(1025.45f, 345.78f);
        rect2.CalculPerimetre();
        rect2.CalculSuperficie();
        rect2.afficheCaracteristique();

        Rectangle rect3 = new Rectangle(102.23f, 654.87f);
        rect3.CalculPerimetre();
        rect3.CalculSuperficie();
        rect3.afficheCaracteristique();
    }
}
