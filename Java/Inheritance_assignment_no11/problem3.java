/*
Employee Management System 
Abstract class Employee:
id, name, salary fields
abstract method calculateSalary()
concrete method showDetails()
Subclasses:
FullTimeEmployee (salary = fixed monthly)
PartTimeEmployee (salary = hourly * rate)
Intern (stipend based)
Interface BonusEligible with method giveBonus().
Only FullTimeEmployee and PartTimeEmployee should implement BonusEligible.
In main class, create employees and calculate salary + bonus.
-------------------------------------------------------------------------------------------------------------
 */
import java.util.Scanner;
abstract class Employee{
    private int id;
    private String name;
    private double salary;
    Employee(){};
    Employee (int id,String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    };
    
    abstract public void calculateSalary();
    public void showDetails(){
        System.out.println("id : "+id +"name :" +name +"salary : "+salary);
    }
    public double getSalary() {
        return salary;
    }

}

interface BonousEligible {
    public void giveBonus();
}

class FullTimeEmployee extends Employee implements BonousEligible{
    FullTimeEmployee(){};
    FullTimeEmployee(int id,String name, double salary){
        super(id,name,salary);
    }
    public void calculateSalary(){
        System.out.println("fixed Montly salary is "+getSalary());
    }
    public void giveBonus(){
         System.out.println("Eligible for bonous" );
    }
}
class PartTimeEmployee extends Employee implements BonousEligible{
    PartTimeEmployee(){};
    PartTimeEmployee(int id,String name, double salary){
        super(id,name,salary);
    }
    public void calculateSalary(){
        System.out.println("Hourly salary is " + getSalary());
    }
    public void giveBonus() {
        System.out.println("Eligible for bonous");
    }
}
class Intern extends Employee{
    Intern(){}; 
    Intern(int id,String name, double salary){
        super(id,name,salary);
    }
    public void calculateSalary() {
        System.out.println("Hourly salary is " + getSalary());
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FullTimeEmployee e1= new FullTimeEmployee(1,"Ritik",10000);
        e1.showDetails();
        e1.giveBonus();
        e1.calculateSalary();
        
        PartTimeEmployee e2=new PartTimeEmployee(2,"Manish",20000);
        e1.showDetails();
        e2.giveBonus();
        e2.calculateSalary();

      
        Intern i1= new Intern(15,"Saksham",4000);
        e1.showDetails();
        i1.calculateSalary();
        

                   
    }
}
