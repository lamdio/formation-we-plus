package weplus.chap06;

public class MainPile {
    public static void main(String[] args) {
        Pile p1 = new Pile(3);
        //p1.affiche();
        try {
            p1.empile(2);
        } catch (PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try {
            p1.empile(10);
        } catch (PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try {
            p1.empile(50);
        } catch (PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try {
            p1.empile(17);
        } catch (PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try{
            p1.depile();
        } catch (PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try{
            p1.depile();
        } catch (PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try{
            p1.depile();
        } catch (PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }

        try{
            p1.depile();
        } catch (PileSizeException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        finally {
            p1.affiche();
        }
    }
}
