package dao;


import java.util.ArrayList;
//import java.util.Scanner;

import model.Employee;


interface EmployeeDAO {
//	static Scanner sc = new Scanner(System.in);

   boolean add(Employee e) ;
  
  ArrayList<Employee> viewAll();
  
   boolean update(Employee e) ;
 
  boolean delete(int id);
  
}
