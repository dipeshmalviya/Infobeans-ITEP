/* Car Info Manager
Create a class Car with fields: brand, model, and year.
Use setters to assign values. Create a method to print full car info.
 */
import java.util.Scanner;
class Car{
private String brand;
private String model;
private short year;

public void setBrand(String brand){
   this.brand=brand;
}
public void setModel(String model){
   this.model=model;
}

public void setYear(short year){
   this.year=year;
}

public void Display(){
 System.out.println("brand = " +brand +"\nmodel= " +model +"\nyear= " +year);
}
}

class Info{
public static void main(String []args){
Scanner sc=new Scanner(System.in);


System.out.println("Enter car's brand : ");
String brand=sc.nextLine();
//sc.nextLine();
System.out.println("Enter car model : ");
String model=sc.nextLine();
System.out.println("Enter car year : ");
short year=sc.nextShort();

Car c1=new Car();

c1.setBrand(brand);
c1.setModel(model);
c1.setYear(year);
c1.Display();


}
}