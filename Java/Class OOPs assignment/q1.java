//1. Write a Java program to create a class called "Person" with a name and 
//age attribute. Create two instances of the "Person" class, set their attributes
// using the constructor, and print their name and age.
import java.util.Scanner;
 class Person {
private byte age;
private String name;
public Person(){}
public Person(byte age,String name){
    this.age=age;
    this.name=name;
}
public void setAge(byte age){
    this.age=age;
}
public void setName(String name){
    this.name=name;
}
public void print(){
    System.out.println("name "+name +"age: "+age);
} 
}
class TestMain{
    public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the name person1:");
    String name = sc.nextLine();
      System.out.println("Enter the age person1:");
    byte age = sc.nextByte();
  sc.nextLine();
    Person p1 = new Person(age,name);
       
    System.out.println("Enter the name person2:");
    String name2= sc.nextLine();
      System.out.println("Enter the age person2:");
    byte age2 = sc.nextByte();

  Person p2 = new Person(age2,name2);
      p1.print();
        p2.print();
    }
}