/* Book Library
Create a class Book with fields: title, author, and price.
Use setters to assign values and a method to print book details.
 */
import java.util.Scanner;
class Book{
private String title;
private String author;
private float price;

public void setTitle(String title){
   this.title=title;
}
public void setAuthor(String author){
   this.author=author;
}

public void setPrice(float price){
   this.price=price;
}

public void print(){
 System.out.println("title = " +title +"\nauthor= " +author +"\nprice= $" +price);
}
}

class Library{
public static void main(String []args){
Scanner sc=new Scanner(System.in);


System.out.println("Enter Book title : ");
String title=sc.nextLine();
//sc.nextLine();
System.out.println("Enter Book author : ");
String author=sc.nextLine();
System.out.println("Enter Book price : ");
float price=sc.nextFloat();

Book b1=new Book();

b1.setTitle(title);
b1.setAuthor(author);
b1.setPrice(price);
b1.print();


}
}