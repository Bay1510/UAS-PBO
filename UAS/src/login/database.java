package login;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class database {
    public java.sql.Connection connection;
    public java.sql.Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException ex) {
            System.out.println("Ups! JDBC Driver belum di import");
        }
        
        try {
            String url = "jdbc:mysql://localhost:3306/loginklinik";
            connection = DriverManager.getConnection(url, "root", "");
        }
        catch(SQLException e) {
            System.out.println("Koneksi ke DB Gagal");
        }
        return connection;
    }
    public static void main(String[]args) {
        java.sql.Connection DB = new database().connect();
    }
}
