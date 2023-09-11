package WePlus.chap09;

import java.sql.*;
import java.util.Date;

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

}
