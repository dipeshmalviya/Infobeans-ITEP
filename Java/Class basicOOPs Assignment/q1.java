/*  Employee Record System
Create a class Employee with private fields: id, name, and salary.
Use setter methods to assign values. Add a method to display employee details. */
import java.util.Scanner;
class Employee{
private int id;
private String name;
private float salary;

public void setId(int id){
   this.id=id;
}
public void setName(String name){
   this.name=name;
}

public void setSalary(float salary){
   this.salary=salary;
}

public void Display(){
 System.out.println("id = " +id +"\nname= " +name +"\nsalary= $" +salary);
}
}

class Company{
public static void main(String []args){
Scanner sc=new Scanner(System.in);


System.out.println("Enter Employee i'd : ");
int id=sc.nextInt();
sc.nextLine();
System.out.println("Enter Employee name : ");
String name=sc.nextLine();
System.out.println("Enter Employee salary : ");
float salary=sc.nextFloat();

Employee e1=new Employee();

e1.setId(id);
e1.setName(name);
e1.setSalary(salary);
e1.Display();


}
}