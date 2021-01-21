package com.boraclinic;
import static com.boraclinic.Connections.con;
import static com.boraclinic.Connections.url;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/**
 * @author mk amos
 */

public class Displays {
    public static Connection con;
    public static String url = "jdbc:ucanaccess://H:\\Bora Clinic\\Database\\Bora Clinic Database.accdb";
    
    public void displayTable(JTable TableSupply){
        try{
            con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String query = "select PatientID , FullName , Gender , Age , Address , Symptoms , DoctorAssigned from PatientsTable";
            ResultSet rs = st.executeQuery(query);
            TableSupply.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
    public void displayTableUsers(JTable TableSupply){
        try{
            con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String query = "select StaffID , FullName , Gender , Age , Address , JobDescription , UserName , UserPassword from StaffTable";
            ResultSet rs = st.executeQuery(query);
            TableSupply.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
    
    public void displayTableRecords(JTable TableSupply){
        try{
            con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String query = "select RecordID , PatientID , AmountPayable , AmountPaid , Balance from BillRecords";
            ResultSet rs = st.executeQuery(query);
            TableSupply.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
    public void displayTableAppointments(JTable TableSupply){
         
         ResultSet rss;
         String doctor = "none";
         String query = ("Select * from AppointmentsTable");
        
        try{
           con = DriverManager.getConnection(url);
           Statement ps = con.createStatement();
           rss = ps.executeQuery(query);
           doctor = rss.getString("DoctorAssigned");
           
        }catch(Exception e){
            e.getStackTrace();
        } 
        
        try{
            con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String query2 = "Select PatientID , PatientName , QueueNumber from AppointmentsTable";
            ResultSet rs = st.executeQuery(query2);
            TableSupply.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
   public void displayTableList(JTable TableSupply){
        try{
            con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String query = "select PatientID , FullName , Gender , Prescription from PatientsTable";
            ResultSet rs = st.executeQuery(query);
            TableSupply.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
    public String nameDisplay(int idd){
         
         ResultSet rss;
         String nameSelect = "non";
         String query = ("Select * from PatientsTable where PatientID='"+idd+"'");
        
        try{
           con = DriverManager.getConnection(url);
           Statement ps = con.createStatement();
           rss = ps.executeQuery(query);
           nameSelect  = rss.getString("FullName");
            System.out.println(nameSelect);
        }catch(Exception e){
            e.getStackTrace();
        } 
        return nameSelect;
    }
}
