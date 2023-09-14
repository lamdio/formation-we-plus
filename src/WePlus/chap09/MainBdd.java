package WePlus.chap09;

public class MainBdd {
    public static void main(String[] args) {
        BddPostgreSql bdd = new BddPostgreSql("jdbc:postgresql://localhost:5432/weplus", "postgres", "Pangol2023!");
        bdd.testConnection();
        //bdd.reqSelect("select count(*) from public.\"Individu\"");
        bdd.reqSelect("select * from public.\"Individu\"");
        //bdd.reqSelect("select * from public.\"Etat_Civil\"");
        //bdd.reqExport("select * from public.\"Individu\"");
        //bdd.reqImport("insert into public.\"Sav_Individu\" values (");
        //bdd.reqInsert("insert into public.\"Individu\" (nom, prenom, date_naissance, adresse, complement, code_postal, ville) values (");
    }
}