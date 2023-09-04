package weplus.chap06;

public class MainPile {
    public static void main(String[] args) {
        weplus.chap06.Pile p1 = new weplus.chap06.Pile(3);
        //p1.affiche();
        try {
            p1.empile(2);
        } catch (weplus.chap06.PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try {
            p1.empile(10);
        } catch (weplus.chap06.PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try {
            p1.empile(50);
        } catch (weplus.chap06.PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try {
            p1.empile(17);
        } catch (weplus.chap06.PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try{
            p1.depile();
        } catch (weplus.chap06.PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try{
            p1.depile();
        } catch (weplus.chap06.PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try{
            p1.depile();
        } catch (weplus.chap06.PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try{
            p1.depile();
        } catch (weplus.chap06.PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }
    }
}
