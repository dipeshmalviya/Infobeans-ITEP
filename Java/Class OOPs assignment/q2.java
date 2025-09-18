/* 2. Write a Java program to create a class called "Dog" 
with a name and breed attribute. Create two instances of the "Dog"
 class, set their attributes using the constructor and modify the 
 attributes using the setter methods and print the updated values. */
 import java.util.Scanner;
 class Dog {
private String name;
private String breed;
public Dog(){}
public Dog(String name,String breed){
    this.name=name;
    this.breed=breed;
}
public void setName(String name){
    this.name=name;
}
public void setBreed(String breed){
    this.breed=breed;
}

public void print(){
    System.out.println("name "+name +"  breed: "+breed);
} 
}
class TestMain{
    public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the name Dog1:");
    String name = sc.nextLine();
      System.out.println("Enter the breed Dog1:");
    String breed = sc.nextLine();

    Dog d1 = new Dog(name,breed);
       
    System.out.println("Enter the name Dog2:");
    String name2= sc.nextLine();
      System.out.println("Enter the breed Dog2:");
    String breed2 = sc.nextLine();

  Dog d2 = new Dog(name2,breed2);

      d1.print();
      d2.print();
        System.out.println("update name Dog1:");
      d1.setName(sc.nextLine());
        System.out.println("update breed Dog1:");
      d2.setBreed(sc.nextLine());
         System.out.println("update name Dog2:");
     d1.setName(sc.nextLine());
        System.out.println("update breed Dog2:");
      d2.setBreed(sc.nextLine());
      d1.print();
      d2.print();
    }
}