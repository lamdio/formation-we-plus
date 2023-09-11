package WePlus.chap09;

public class MainBdd {
    public static void main(String args[]) {
        BddPostgreSql bdd = new BddPostgreSql("jdbc:postgresql://localhost:5432/weplus", "postgres", "Pangol2023!");
        bdd.testConnection();
        //bdd.reqSelect("select * from public.\"Individu\"");
        //bdd.reqExport("select * from public.\"Individu\"");
        bdd.reqImport("insert into public.\"Sav_Individu\" values (");
    }
}