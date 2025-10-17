/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeee;

/**
 *
 * @author malvi
 */

public class Employee {
    private int id;
    private String name;
    private String role;

    public Employee(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + role;
    }

    public static Employee fromString(String line) {
        String[] parts = line.split(",");
        return new Employee(Integer.parseInt(parts[0]), parts[1], parts[2]);
    }
}





























/*   import java.io.Serializable;
public class Employee implements Serializable{
    private int eid;
    private String ename;
    private String edepartment;
    private double esalary;
    private String econtact;
    public static  int counter=1;
    
    public Employee(){
        
    } 
    public Employee(String ename,String edepartment, double esalary,String contact){
          eid=counter++;
        this.ename=ename;
        this.edepartment=edepartment;
        this.esalary=esalary;
        this.econtact=econtact;
       
        
    }
    //seetter
    public void setEName(String ename){
      this.ename=ename;
        
}
    public void setEDepartment(String edepartment){
      this.edepartment=edepartment;
        
}
     public void setESalary(double esalary){
      this.esalary=esalary;
        
}
          public void setEContact(String econtact){
      this.econtact=econtact;
        
}
          
          //getter
          public int getEID(){
          return eid;
          }
      
              public String getEName(){
      return ename;
        
}
    public String getEDepartment( ){
      return edepartment;
        
}
     public double getESalary( ){
      return esalary;
        
}
          public String getEContact( ){
      return econtact;
        
}
         
    @Override
    public String toString(){
       return (eid+" "+ename +" "+edepartment +" "+esalary + " "+econtact);     
    }      
    public static Employee fromString(String line) {
        String[] parts = line.split(",");
      //  return new Employee(Integer.parseInt(parts[0]), parts[1], parts[2]);
    }

    
}
*/
