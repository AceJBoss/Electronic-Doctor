/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edoctor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//lkojijiojoijioi

public class DataBaseHandler
{
    public  PreparedStatement pst ;
    public  Connection con;
    
    public DataBaseHandler()
    {
        pst = null;
        con = null;
    }
    public void loadDriver()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver Loaded");
        }
        catch(Exception ex)
        {
            System.out.println("Error "+ ex.getMessage());
        }
    }
    public void connectToDatabase(String dbName,String user,String pass)
    {
        try
        {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName, user, pass);
           System.out.println("Connected to database: "+ dbName);
        }
        catch (SQLException ex)
        {
            System.out.println("Error "+ ex.getMessage());
        }
    }
    public void createDataBase(String dbName)
    {        
        String query = "CREATE DATABASE IF NOT EXISTS "+dbName;
        try
        {
            connectToDatabase("mysql","root","");
            pst = con.prepareStatement(query);
            int resp =  pst.executeUpdate();
            if(resp != -1)
            {
                System.out.println("Database \""+ dbName+"\" created ");
            }

            pst.close();
            con.close();
        } 
        catch (SQLException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
    public void creatTable1(String tbname)
    {
        String query = "CREATE TABLE IF NOT EXISTS "+tbname+" (ID INT( 10 ) NOT NULL ," +
                "DoctorID VARCHAR( 30 ) NOT NULL ," +
                "AppointmentDate VARCHAR( 250 ) NOT NULL ," +
                "Time_of_the_day VARCHAR( 10 ) NOT NULL ," +
                "PatientID VARCHAR( 30 ) NOT NULL ," +
                "Booked_appointment_on VARCHAR( 60 ) NOT NULL ," +
                "PRIMARY KEY ( ID )) ENGINE = InnoDB ";

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vda", "root", "");
            pst = con.prepareStatement(query);
            int resp =  pst.executeUpdate();
            if(resp != -1)
            {
                System.out.println("Table \""+ tbname+"\" created ");
            }

            pst.close();
            con.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
     public void creatTable2(String tbname)
    {
        String query = "CREATE TABLE IF NOT EXISTS "+tbname+" (SN INT( 11) NOT NULL," +
                "Item VARCHAR( 50 ) NOT NULL ," +
                "PatientID VARCHAR( 50 ) NOT NULL ," +
                "Amount VARCHAR( 50 ) NOT NULL ," +
                "Paymeent_Mode VARCHAR( 50 ) NOT NULL ," +
                "Payment_Status VARCHAR( 50 ) NOT NULL ," +
                "Date datetime NOT NULL ," +
                "PRIMARY KEY ( SN )) ENGINE = InnoDB ";

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vda", "root", "");
            pst = con.prepareStatement(query);
            int resp =  pst.executeUpdate();
            if(resp != -1)
            {
                System.out.println("Table \""+ tbname+"\" created ");
            }

            pst.close();
            con.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
//      public void creatTable3(String tbname)
//    {
//        String query = "CREATE TABLE IF NOT EXISTS "+tbname+" (ID INT( 30) NOT NULL," +
//                "PatientID VARCHAR( 50 ) NOT NULL ," +
//                "Symptoms VARCHAR( 300 ) NOT NULL ," +
//                "Date_ailment_begin VARCHAR( 40 ) NOT NULL ," +
//                "Diagnosis VARCHAR( 300) NOT NULL ," +
//                "PRIMARY KEY ( ID )) ENGINE = InnoDB ";
//
//        try
//        {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vda", "root", "");
//            pst = con.prepareStatement(query);
//            int resp =  pst.executeUpdate();
//            if(resp != -1)
//            {
//                System.out.println("Table \""+ tbname+"\" created ");
//            }
//
//            pst.close();
//            con.close();
//        }
//        catch (SQLException ex)
//        {
//            System.out.println("Error "+ex.getMessage());
//        }
//    }
       public void creatTable4(String tbname) //doctors
    {
        String query = "CREATE TABLE IF NOT EXISTS "+tbname+" (DoctorID INT(10) NOT NULL auto_increment," +
                "Name varchar(100) NOT NULL," +
                "Password varchar(50) NOT NULL ," +
                "Sex varchar(10) NOT NULL," +
                "DOB varchar(30) NOT NULL ," +
                "Address varchar(150) NOT NULL ," +
                "Mobile_Number varchar(15) NOT NULL," +
                "Specialisation varchar(100) NOT NULL ," +
                "Consultation_Day varchar(100) NOT NULL ," +
                "Consultation_Time varchar(100) NOT NULL ," +
                "Email varchar(100) NOT NULL ," +
                "Consultation_Fee VARCHAR( 60 ) NOT NULL ," +
                "homeaddress VARCHAR( 60 ) NOT NULL ," +
                "Othernames VARCHAR( 20 ) NOT NULL ," +
                "Maritalstatus VARCHAR( 30 ) NOT NULL ," +
                "Religion VARCHAR( 20 ) NOT NULL ," +
                "age_range VARCHAR( 20 ) NOT NULL ," +
                "StateofOrigin VARCHAR( 30 ) NOT NULL ," +
                "Nationality VARCHAR( 30 ) NOT NULL ," +
                "Docname VARCHAR( 30 ) NOT NULL ," +
                "Doctorpic LONGBLOB NOT NULL ," +
                "PRIMARY KEY (DoctorID)) ENGINE = InnoDB ";

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vda", "root", "");
            pst = con.prepareStatement(query);
            int resp =  pst.executeUpdate();
            if(resp != -1)
            {
                System.out.println("Table \""+ tbname+"\" created ");
            }

            pst.close();
            con.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
        public void creatTable5(String tbname)
    {
        String query = "CREATE TABLE IF NOT EXISTS "+tbname+" (ID int(50) NOT NULL auto_increment," +
                "PatientID varchar(10) NOT NULL ," +
                "Ailment varchar(255) NOT NULL ," +
                "Prescription varchar(50) NOT NULL ," +
                "Date varchar(50) NOT NULL," +
                "PRIMARY KEY ( ID)) ENGINE = InnoDB ";

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vda", "root", "");
            pst = con.prepareStatement(query);
            int resp =  pst.executeUpdate();
            if(resp != -1)
            {
                System.out.println("Table \""+ tbname+"\" created ");
            }

            pst.close();
            con.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
         public void creatTable6(String tbname) //Advice table
    {
       String query = "CREATE TABLE IF NOT EXISTS "+tbname+" (AdviceID Int(20) NOT NULL auto_increment ," +
                "PatID varchar(40) NOT NULL ," +
                "Patient_Symptoms varchar(280) NOT NULL," +
                "Previous_Medicine varchar(100) NOT NULL ," +
                "DoctorID VARCHAR(50) NOT NULL ," +
                "datesicknesstarted varchar(30) NOT NULL ," +
                "Diagnosis VARCHAR( 200 ) NOT NULL ," +
                "PRIMARY KEY (AdviceID)) ENGINE = InnoDB ";

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vda", "root", "");
            pst = con.prepareStatement(query);
            int resp =  pst.executeUpdate();
            if(resp != -1)
            {
                System.out.println("Table \""+ tbname+"\" created ");
            }

            pst.close();
            con.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
          public void creatTable7(String tbname)   //for patients
    {
                String query = "CREATE TABLE IF NOT EXISTS "+tbname+" (PatID INT( 10 ) NOT NULL auto_increment," +
                "Uname VARCHAR( 30 ) NOT NULL ," +
                "sname VARCHAR( 30 ) NOT NULL ," +
                "othernames VARCHAR( 30 ) NOT NULL ," +
                "gender VARCHAR( 10 ) NOT NULL ," +
                "dateofbirth VARCHAR( 20 ) NOT NULL ," +
                "status VARCHAR( 10 ) NOT NULL ," +
                "religion VARCHAR( 20 ) NOT NULL ," +
                "state VARCHAR( 20 ) NOT NULL ," +
                "nationality VARCHAR( 20 ) NOT NULL ," +
                "password VARCHAR( 20 ) NOT NULL ," +
                "email VARCHAR( 30 ) NOT NULL ," +
                "dateregisterd varchar(30) NOT NULL," +
                "contactaddress VARCHAR( 60 ) NOT NULL ," +
                "homeaddress VARCHAR( 60 ) NOT NULL ," +
                "phone VARCHAR( 20 ) NOT NULL ," +
                "occupation VARCHAR( 20 ) NOT NULL ," +
                "heigt VARCHAR( 10 ) NOT NULL ," +
                "blood_group VARCHAR( 10 ) NOT NULL ," +
                "age_range VARCHAR( 20 ) NOT NULL ," +
                "med_history VARCHAR( 20 ) NOT NULL ," +
                "pic LONGBLOB NOT NULL ," +
                "PRIMARY KEY ( PatID )) ENGINE = InnoDB ";

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vda", "root", "");
            pst = con.prepareStatement(query);
            int resp =  pst.executeUpdate();
            if(resp != -1)
            {
                System.out.println("Table \""+ tbname+"\" created ");
            }

            pst.close();
            con.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
    public void creatTable8(String tbname)
    {
        String query = "CREATE TABLE IF NOT EXISTS "+tbname+" (PharmacyID INT(10) NOT NULL auto_increment," +
                "PharmName varchar(22) NOT NULL," +
                "Name varchar(100) NOT NULL," +
                "Password varchar(50) NOT NULL ," +
                "Sex varchar(10) NOT NULL," +
                "DOB varchar(30) NOT NULL ," +
                "Address varchar(150) NOT NULL ," +
                "Mobile_Number varchar(15) NOT NULL," +
                "Specialisation varchar(100) NOT NULL ," +
                "Email varchar(100) NOT NULL ," +
                "dateRegistered datetime NOT NULL ," +
                "contactaddress VARCHAR( 60 ) NOT NULL ," +
                "homeaddress VARCHAR( 60 ) NOT NULL ," +
                "phone VARCHAR( 20 ) NOT NULL ," +
                "occupation VARCHAR( 20 ) NOT NULL ," +
                "heigt VARCHAR( 10 ) NOT NULL ," +
                "blood_group VARCHAR( 10 ) NOT NULL ," +
                "age_range VARCHAR( 20 ) NOT NULL ," +
                "med_history VARCHAR( 20 ) NOT NULL ," +
                "pic LONGBLOB NOT NULL ," +
                "PRIMARY KEY (PharmacyID)) ENGINE = InnoDB ";

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vda", "root", "");
            pst = con.prepareStatement(query);
            int resp =  pst.executeUpdate();
            if(resp != -1)
            {
                System.out.println("Table \""+ tbname+"\" created ");
            }

            pst.close();
            con.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
        public void creatTable9(String tbname)
    {
        String query = "CREATE TABLE IF NOT EXISTS "+tbname+" (PrescriptionID int(50) NOT NULL auto_increment," +
                "PatientID varchar(50) NOT NULL," +
                "DoctorID varchar(50) NOT NULL," +
                "PharmacyID varchar(50)NOT NULL," +
                "Medicine varchar(200) NOT NULL," +
                "Dosage varchar(30) NOT NULL ," +
                "Times_per_Day varchar(50) NOT NULL," +
                "PRIMARY KEY (PrescriptionID)) ENGINE = InnoDB ";

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vda", "root", "");
            pst = con.prepareStatement(query);
            int resp =  pst.executeUpdate();
            if(resp != -1)
            {
                System.out.println("Table \""+ tbname+"\" created ");
            }

            pst.close();
            con.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
     public void creatTable10(String tbname)
    {
        String query = "CREATE TABLE IF NOT EXISTS "+tbname+" (Diag_ID INT( 10 ) NOT NULL auto_increment," +
                "DoctorID VARCHAR( 30 ) NOT NULL ," +
                "PatID VARCHAR( 250 ) NOT NULL ," +
                "DateTreated VARCHAR( 30 ) NOT NULL ," +
                "Doc_Diag VARCHAR( 300 ) NOT NULL ," +
                "PRIMARY KEY ( Diag_ID )) ENGINE = InnoDB ";

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vda", "root", "");
            pst = con.prepareStatement(query);
            int resp =  pst.executeUpdate();
            if(resp != -1)
            {
                System.out.println("Table \""+ tbname+"\" created ");
            }

            pst.close();
            con.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
}