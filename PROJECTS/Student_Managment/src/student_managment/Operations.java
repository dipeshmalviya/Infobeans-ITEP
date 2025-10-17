/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_managment;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author malvi
 */
public class Operations {
    
    public static void add(){
        try(Connection con = GetConnection.getConnection();){
            Scanner sc = new Scanner(System.in);
            
             System.out.println("Enter Enrollment no");
            String enrollment_no=sc.next();
            
            System.out.println("Enter first name");
            String first_name=sc.next();
            
             System.out.println("Enter last name");
            String last_name=sc.next();
            
            System.out.println("Enter dob in this formate(yyyy-mm-dd)");
            String dob=sc.next();
            
            System.out.println("Enter gender(Male,Female,Other)");
            String gender=sc.next();
            
              System.out.println("Enter Email id");
            String email=sc.next();
            
             System.out.println("Enter phone number");
            String phone=sc.next();
            
            System.out.println("Enter address");
            String address=sc.next();
            
             System.out.println("Enter course");
            String course=sc.next();
            
            System.out.println("Enter year");
            int year=sc.nextInt();
            
            System.out.println("Enter CGPA");
            float cgpa=sc.nextFloat();
            
           String sql = "INSERT INTO student (enrollment_no, first_name, last_name, dob, gender, email, phone, address, course, year, cgpa) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

           
            PreparedStatement pst = con.prepareStatement(sql);
            
             pst.setString(1, enrollment_no);   
            pst.setString(2, first_name);       
            pst.setString(3, last_name);      
            pst.setDate(4, Date.valueOf(dob)); 
            pst.setString(5,gender );         
            pst.setString(6, email); 
            pst.setString(7, phone); 
            pst.setString(8, address);
            pst.setString(9, course);       
            pst.setInt(10, year);               
            pst.setDouble(11, cgpa);          
            
            
            int rows = pst.executeUpdate();
           
            
            if (rows > 0) {
                System.out.println("Student added successfully!");
            } else {
                System.out.println("Failed to add student!");
            }

          
         
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
     public static void fetch(){
         try(Connection con = GetConnection.getConnection();){
              Scanner sc = new Scanner(System.in);
              
              System.out.println("Enter Enrollment no");
            String enrollment_no=sc.next();
             
         String sql = "SELECT * FROM student WHERE enrollment_no = ?";
         PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, enrollment_no); 

          ResultSet rs = pst.executeQuery();

          if (rs.next()) {
                 System.out.println("Student Found:");
                    System.out.println("Name: " + rs.getString("first_name") + " " + rs.getString("last_name"));
                    System.out.println("Course: " + rs.getString("course"));
                         System.out.println("Year: " + rs.getInt("year"));
                            System.out.println("CGPA: " + rs.getDouble("cgpa"));
                } else {
    System.out.println(" No student found with this enrollment number.");
                }
         
       
         }
          catch(Exception e){
            e.printStackTrace();
        }

     }
     
     public static void remove( ){
          try(Connection con = GetConnection.getConnection();){
              
               Scanner sc = new Scanner(System.in);
              
              System.out.println("Enter Enrollment no");
              String enrollment_no=sc.next();
              
         String sql = "DELETE FROM student WHERE enrollment_no = ?";
           PreparedStatement pst = con.prepareStatement(sql);
          pst.setString(1, enrollment_no);

         int rows = pst.executeUpdate();
           System.out.println(rows > 0 ? " Record deleted!" : " No record found to delete!");
          }
          
    catch(Exception e){
            e.printStackTrace();
        }
          
     }
     public static void update( ){
         
          try(Connection con = GetConnection.getConnection();){
              
              Scanner sc = new Scanner(System.in);
              
              System.out.println("Enter Enrollment no");
            String enrollment_no=sc.next();
            
             System.out.println("Enter Email id");
            String email=sc.next();
            
             System.out.println("Enter phone number");
            String phone=sc.next();
            
             System.out.println("Enter CGPA");
            float cgpa=sc.nextFloat();
              
         String sql = "UPDATE student SET email = ?, phone = ?, cgpa = ? WHERE enrollment_no = ?";
             PreparedStatement pst = con.prepareStatement(sql);
              pst.setString(1, email);
                   pst.setString(2, phone);
                   pst.setDouble(3, cgpa);
                   pst.setString(4, enrollment_no); 

                   int rows = pst.executeUpdate();
                 System.out.println(rows > 0 ? " Record updated!" : " Update failed!");

    
     }
           catch(Exception e){
            e.printStackTrace();
        }
     }
     public static void viewAllRecord(){
          try(Connection con = GetConnection.getConnection();){
         
         String sql = "SELECT * FROM student";
          PreparedStatement pst = con.prepareStatement(sql);
              ResultSet rs = pst.executeQuery();

             System.out.println("---- All Students ----");
            while (rs.next()) {
                System.out.println(
                      rs.getString("enrollment_no") + " | " +
                       rs.getString("first_name") + " " + rs.getString("last_name") + " | " +
                     rs.getString("course") + " | Year: " + rs.getInt("year") + " | CGPA: " + rs.getDouble("cgpa")
    );
                        
}
          }

         catch(Exception e){
            e.printStackTrace();
        }
     }
}
