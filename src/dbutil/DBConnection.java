package com.aman.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","seatbooking","tnp");  
            //JOptionPane.showMessageDialog(null, "Connection connected Successfully to the database","Success!",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Cannot connect to the database","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(0);
        }catch(ClassNotFoundException cf)
        {
            JOptionPane.showMessageDialog(null, "Something Went Wrong!","Error!",JOptionPane.ERROR_MESSAGE);
            cf.printStackTrace();
            System.exit(0);
        }        
    }

    public static Connection getConnection() {
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null, "Disconnected successfully to the DB");

        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Cannot disconnect with the DB");
            ex.printStackTrace();       
        }
    }
}
