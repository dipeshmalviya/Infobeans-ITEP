package main;

import java.util.ArrayList;
import java.util.Scanner;

import dao.EmployeeDAOImpl;
import model.Employee;

public class EmployeeApp {
  public static void main(String args[]) {
	  boolean loop = true;
	  Scanner sc = new Scanner(System.in);
	  EmployeeDAOImpl empdimpl = new EmployeeDAOImpl();
	  
	  while(loop) {

		  System.out.println("Press 1 for add employee details");
		  System.out.println("Press 2 for view all record");
		  System.out.println("Press 3 for update employee details");
		  System.out.println("Press 4 for delete employee details");
		  System.out.println("Press 5 for exit");
		  
		  System.out.println("Enter a choice");
		  int choice = sc.nextInt();
		  
		  switch(choice) {
		  case 1: 
			  System.out.println("Enter employee name");
			  String name = sc.next();
			  System.out.println("Enter employee email");
			  String email = sc.next();
		      System.out.println("Enter salary");
		      int salary = sc.nextInt();
		      System.out.println("Enter employee department");
			  String department = sc.next();
		      Employee e = new Employee(name, email, salary,department );
		      boolean status = empdimpl.add(e);
		      if(status)
		    	  System.out.println("Employee added");
		      else
		    	  System.out.println("Not add..");
		      System.out.println();
		      break;
		     
		  case 2:
			  ArrayList<Employee> al =  empdimpl.viewAll();
			  for(Employee e1 : al) 
				  System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getEmail()+" "+e1.getSalary()+" "+e1.getDepartment());
			  System.out.println();
			  break;
			  
		  case 3:
			  System.out.println("Enter id where you want to update details");
		      int id1 = sc.nextInt();
			  System.out.println("Enter updated employee name");
			  String name2 = sc.next();
			  System.out.println("Enter updated employee email");
			  String email2 = sc.next();
		      System.out.println("Enter updated salary");
		      int salary2 = sc.nextInt();
		      System.out.println("Enter updated employee department");
			  String department2 = sc.next();
		      Employee e2 = new Employee(id1,name2, email2, salary2,department2 );
		      boolean status2 = empdimpl.update(e2);
		      if(status2)
		    	  System.out.println("Employee updated");
		      else
		    	  System.out.println("Not update..");
		      System.out.println();
		      break;
		      
		  case 4:
			  System.out.println("Enter ID");
		      int id = sc.nextInt();
		      boolean status3 = empdimpl.delete(id);
		      if(status3)
		    	  System.out.println("Employee deleted");
		      else
		    	  System.out.println("Not deleted..");
		      System.out.println();
			 break; 
			 
		  case 5:
			  loop = false;
			  break;
			  
		 default :{
				  System.out.println("Invalid choice");
				  System.out.println();
			  }
		  
		  }
		  sc.close();
	  }
	  
	  
	  
	  
	  
	  

}
  
}