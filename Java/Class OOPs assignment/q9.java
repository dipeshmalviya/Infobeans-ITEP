/* 9. Write a Java program to create a class called 
"Employee" with a name, salary, and hire date attributes,
 and a method to calculate years of service.
 */
import java.util.Scanner;
class Employee{
    private String name;
    private int salary;
    private int hiredate;
    public Employee(){}
    public Employee(String name,int salary,int hiredate){
        this.name=name;
        this.salary=salary;
        this.hiredate=hiredate;
    }
  public int calYearOfService(){
    return (2025-hiredate);
  }
  
}
class TestMain{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name of employee");
        String name=sc.nextLine();
         System.out.println("Enter a salary of employee");
        int salary=sc.nextInt();
         System.out.println("Enter a hireing date in year of employee");
        int hiredate=sc.nextInt();


       Employee e1=new Employee(name,salary,hiredate);
       int service=e1.calYearOfService();
       System.out.println("year of service is :"+service);

    }
}