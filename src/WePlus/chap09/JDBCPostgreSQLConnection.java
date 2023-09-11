package WePlus.chap09;

import java.sql.*;

public class JDBCPostgreSQLConnection {
        private final static String url = "jdbc:postgresql://localhost:5432/weplus";
        private final static String user = "postgres";
        private final static String password = "Pangol2023!";

    public static void main(String args[]) {
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection!= null) {
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

        /**
         * Connect to the PostgreSQL database
         *
         * @return a Connection object
         */
/*        public Connection connect() {
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url, user, password);

                if (conn != null) {
                    System.out.println("Connected to the PostgreSQL server successfully.");
                } else {
                    System.out.println("Failed to make connection!");
                }

            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return conn;
        }
*/
        /**
         * @param args the command line arguments
         */
/*        public static void main(String[] args) {
            JDBCPostgreSQLConnection app = new JDBCPostgreSQLConnection();
            app.connect();
       }
*/
}
