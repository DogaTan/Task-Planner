/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskplannerapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
/**
 *
 * @author dogat
 */
public class TaskPlanner_Database {
 
 static final String DB_URL = "jdbc:mysql://localhost:3306/se2224_20070006002?zeroDateTimeBehavior=CONVERT_TO_NULL";
 static final String USER = "root";
 static final String PASS = "g3ZbD4Hv";
 
public static Connection myConnection()throws SQLException{
    Connection conn;
    try{
       //Class.forName("com.mysql.jdbc.driver"); 
        conn = DriverManager.getConnection(DB_URL,USER,PASS); 
        return conn;
    }
    catch(Exception e){
      return null;  
    }
}   
    
    
}
