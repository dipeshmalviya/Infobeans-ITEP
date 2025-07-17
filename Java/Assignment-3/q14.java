/* 14.Write a program to accept percantage from the user and
display grade according to the following criteria
  Marks	  		Grade
  > 90       		 A
  >80 and <=90		 B
  >=60 and <=80		 C
  below 60		 D  */



import java.util.Scanner;
class Grade{
public static void main(String []args){
Scanner sc=new Scanner (System.in);
System.out.println("Enter Percentage %:");
int percent=sc.nextInt();
if(percent>90)
   System.out.println("A");
else if(percent>80 && percent<=90 )
   System.out.println("B");
else if(percent>=60 && percent<=80 )
   System.out.println("C");
else if(percent<60 )
   System.out.println("D");



else 
   System.out.println("Invalid Percentage");





}
}

