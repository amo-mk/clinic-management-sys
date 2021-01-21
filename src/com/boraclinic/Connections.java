package com.boraclinic;

/**
  * @author amos kiprotich
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Connections {
    
    public static Connection con;
    public static String url = "jdbc:ucanaccess://H:\\Bora Clinic\\Database\\Bora Clinic Database.accdb";
   
    public static Connection getConnection(){
        
        try{
            con = DriverManager.getConnection(url);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }  
}
