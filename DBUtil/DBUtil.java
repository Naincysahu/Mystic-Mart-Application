package eMart.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBUtil {
    public static Connection conn;
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Mystic","root","snaincy@97522");
            JOptionPane.showMessageDialog(null,"Connection opened successfully","Connetion Opened",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error in loading the driver","Driver Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            System.exit(1);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error in Opening Connecion","Open Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null, "Connection closed successfully","Connection Closed",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error in closing the connection","Close Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }
}
