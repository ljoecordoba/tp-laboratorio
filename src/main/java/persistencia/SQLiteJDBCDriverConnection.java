package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author sqlitetutorial.net
 */
public class SQLiteJDBCDriverConnection {
     /**
     * Connect to a sample database
     */
    public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:/home/luciano/Escritorio/laboratorio.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            return conn;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = connect();
        try {
			PreparedStatement stmt = con.prepareStatement("INSERT INTO TBL1 VALUES(?,?)");
			stmt.setString(1, "Luciano");
			stmt.setString(2, "39040519");
			stmt.executeUpdate();
			stmt.setString(1, "Jorge");
			stmt.setString(2, "77489000");
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}