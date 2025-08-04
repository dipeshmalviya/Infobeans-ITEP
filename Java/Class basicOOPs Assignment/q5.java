/*  Product Inventory
Create a class Product with fields: productId, name, quantity, price.
Use setters to assign values. Add a method to calculate total value (quantity * price). */

import java.util.Scanner;
class Product{
private int productId;
private String name;
private int quantity;
private float price;

public void setProductId(int productId){
   this.productId=productId;
}
public void setName(String name){
   this.name=name;
}
public void setQuantity(int quantity){
   this.quantity=quantity;
}

public void setPrice(float price){
   this.price=price;
}

public void Display(){
 System.out.println("productId = " +productId +"\nname= " +name +"\nquantity = "+quantity +"\nprice= $" +price);
}

public float totalValue(float price,int quantity){
  return(price*quantity);
}

}

class Inventory{
public static void main(String []args){
Scanner sc=new Scanner(System.in);


System.out.println("Enter product Id: ");
int productId=sc.nextInt();
sc.nextLine();
System.out.println("Enter product name : ");
String name=sc.nextLine();
System.out.println("Enter product quantity: ");
int quantity=sc.nextInt();
System.out.println("Enter product price : ");
float price=sc.nextFloat();

Product p1=new Product();

p1.setProductId(productId);
p1.setName(name);
p1.setQuantity(quantity);
p1.setPrice(price);
p1.Display();
float total=p1.totalValue(price,quantity);
System.out.println("total value of products is : $"+total);




}
}