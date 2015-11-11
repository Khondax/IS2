package Kata5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Khondax
 */
public class Kata5VM {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Class.forName("org.sqlite.JDBC");
        Connection conec = DriverManager.getConnection("jdbc:sqlite:Kata5");
        
        Statement stat = conec.createStatement();
        
        ResultSet rs = stat.executeQuery("SELECT * FROM People");
        
        while (rs.next()){
            System.out.println("ID = " + rs.getInt("ID"));
            System.out.println("NAME = " + rs.getString("NAME") + "\n");
        }
        
    }
}
