package WePlus.chap09;

import java.io.*;
import java.sql.*;
import java.util.Arrays;

public class BddPostgreSql {
    private String url;
    private String user;
    private String password;
    private Connection conn = null;

    public BddPostgreSql(String ur, String us, String pa) {
        this.url = ur;
        this.user = us;
        this.password = pa;
    }

    public String getUrl() { return url; }
    public String getUser() { return user; }
    public String getPassword() { return password; }

    public void setUrl(String url) { this.url = url; }
    public void setUser(String user) { this.user = user; }
    public void setPassword(String password) { this.password = password; }

    public void testConnection () {
        try{
            conn = DriverManager.getConnection(this.url, this.user, this.password);
            if (conn!= null) {
                System.out.println("Connected successfully!");
            }
            else {
                System.out.println("Failed to connect.");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void reqSelect (String req) {
        String output = "";
        try {
            /*PreparedStatement stmt = conn.prepareStatement(req);
            ResultSet rs = stmt.executeQuery();*/
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(req);
            int nbcols = rs.getMetaData().getColumnCount();
            System.out.print("Nombre de colonnes ramenées : "+nbcols + "\n");

            while (rs.next()) {
                /*System.out.println(rs.getInt("id_individu") + " - " +
                rs.getString("nom") + " - " + rs.getString("prenom"));*/
                //rs.getMetaData().getColumnType()
                for (int col = 1; col <= nbcols; col++) {
                    if (rs.getObject(col) != null) {
                        output = rs.getObject(col).toString();
                        System.out.print(output);
                    }
                    if (col != nbcols) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void reqExport (String req) {
        String output = "";
        try {
            /*PreparedStatement stmt = conn.prepareStatement(req);
            ResultSet rs = stmt.executeQuery();*/
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(req);
            int nbcols = rs.getMetaData().getColumnCount();
            //System.out.print("Nombre de colonnes ramenées : "+nbcols + "\n");
            File fichier = new File("c:/Users/ldio/Formation_We+/Java/Export_table.txt");
            FileWriter ecrivain = new FileWriter(fichier/*, true*/);
            BufferedWriter buffer = new BufferedWriter(ecrivain);

            while (rs.next()) {
                for (int col = 1; col <= nbcols; col++) {
                    if (rs.getObject(col) != null) {
                        output = output + rs.getObject(col).toString();
                        //System.out.print(output);
                    }
                    if (col != nbcols) {
                        output = output + "#";
                    }
                }
                buffer.write(output);
                System.out.println(output);
                output = "";
                buffer.newLine();
            }
            buffer.close();
            ecrivain.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void reqImport (String req) {
        try {
            File fichier = new File("c:/Users/ldio/Formation_We+/Java/Export_table.txt");
            FileReader lecteur = new FileReader(fichier);
            BufferedReader buffer = new BufferedReader(lecteur);
            String ligne;
            int indice = 0;
            String ireq = req;

            Statement stmt = conn.createStatement();

            while ((ligne = buffer.readLine()) != null) {
                //System.out.println(ligne);
                String col[] = ligne.split("#");
                String splitligne = Arrays.toString(col);
                System.out.println(splitligne);
                int indmax = col.length - 1;
                //System.out.println("indice :" + indice + " indmax : " + indmax);

                for (String a: col) {
                    if (indice < indmax) {
                        ireq = ireq + "'" + a + "', ";
                    } else {
                        ireq = ireq + "'" + a + "')";
                    }
                    indice++;
                }
                System.out.println(ireq);
                stmt.executeUpdate(ireq);
                indice = 0;
                ireq = req;
            }

            buffer.close();
            lecteur.close();
            conn.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
