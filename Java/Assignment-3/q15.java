/*
15. Write a java program to accept the cost price of a bike
    and display the road tax to be paid according to the 
    following criteria.
    Cost Price(In Rs)		Tax
     > 100000			 15%
     >50000 and <=100000	 10%
     <=50000			 5%	*/



import java.util.Scanner;
class Bike{
public static void main(String []args){
Scanner sc=new Scanner (System.in);
System.out.println("Enter Bike Price:");
int price=sc.nextInt();
if(price>100000)
    System.out.println("Tax 15%");
else if(price>50000 && price<=100000)
    System.out.println("Tax 10%");
else if(price<=50000)
    System.out.println("Tax 5%");

else 
   System.out.println("Invalid Bike price");





}
}

