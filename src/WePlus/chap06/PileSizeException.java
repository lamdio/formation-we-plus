package weplus.chap06;

public class PileSizeException extends Exception {
    //private int codeErreur;

    public PileSizeException(String code) {
        super("Erreur Pile -> code =" + code + "\n");
        /*codeErreur = code;
        System.out.println(" -> code =" + getErrorCode());*/
    }
    /*public final int getErrorCode() {
        return codeErreur;
    }*/
}
