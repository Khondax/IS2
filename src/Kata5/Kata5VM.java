package Kata5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
        
        //Class.forName("org.sqlite.JDBC");
        //Connection conec = DriverManager.getConnection("jdbc:sqlite:Kata5");

        
        //Class.forName("org.oracle.driver.OracleDriver");
        
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

        Connection conec = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "orcl");
        
        Statement stat = conec.createStatement();
        
        ResultSet rs = stat.executeQuery("SELECT * FROM People");
        
        while (rs.next()){
            System.out.println("ID = " + rs.getInt("ID"));
            System.out.println("NAME = " + rs.getString("NAME") + "\n");
        }
        
        
        String nameFile = "E:\\Mis documentos\\Miguel\\Universidad\\Asignaturas\\IS2\\DATA\\emaildata.txt";
        BufferedReader reader = new BufferedReader (new FileReader (new File (nameFile)));
        String mail;
        
        while ((mail = reader.readLine())!= null){
            String query = "INSERT INTO Mail (MAIL) VALUES ('" + mail + "')";
            stat.executeUpdate(query);
        }
        
        rs.close();
        stat.close();
        conec.close();
        
    }
}
