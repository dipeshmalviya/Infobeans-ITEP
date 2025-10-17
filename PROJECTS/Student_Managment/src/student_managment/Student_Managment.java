/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_managment;

import static java.lang.System.exit;
import java.util.Scanner;
import static student_managment.Operations.add;
import static student_managment.Operations.fetch;
import static student_managment.Operations.remove;
import static student_managment.Operations.update;
import static student_managment.Operations.viewAllRecord;



/**
 *
 * @author malvi
 */
public class Student_Managment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        boolean check=true;
        System.out.println("Welcome in Student Managment");   

                while(check){              
                    
         System.out.println("Please Enter your choice");
        System.out.println("Press 1 for Add Student");
        System.out.println("Press 2 for fetch student by Enrollment number");
        System.out.println("Press 3 for Remove Student  by Enrollment number");
        System.out.println("Press 4 for Update Student by  by Enrollment number");
        System.out.println("Press 5 for View all Student Record");
        System.out.println("Press 6 for Exit");    
                    
          int x  = sc.nextInt();
                    
                  switch (x) {
                      case 1:
                              add(); 
                                break;  
                      case 2:
                               fetch();
                                  break;
                      case 3:
                               remove();
                                  break;
                      case 4:
                              update();
                                  break;
                      case 5:
                                viewAllRecord() ;
                                  break;
                     case 6:
                                exit(0);
                                  
                      default:
                           System.out.println("Please Enter valid  number");
                          
                          
                 }                        

                       
                    
                   
        
    }
    
}
}