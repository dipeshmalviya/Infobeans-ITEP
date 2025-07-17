/* Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday */



import java.util.Scanner;
class Week{
public static void main(String []args){
Scanner sc=new Scanner (System.in);
System.out.println("Enter integer from 1 to 7:");
int dayno=sc.nextInt();
if(dayno>=1 && dayno<=7){
   if(dayno==1)
     System.out.println("Monday");
   else if(dayno==2)
     System.out.println("Tuesday");
   else if(dayno==3)
     System.out.println("Wednesday");
   else if(dayno==4)
     System.out.println("Thursday");
   else if(dayno==5)
     System.out.println("Friday");
   else if(dayno==6)
     System.out.println("Saturday");
   else
     System.out.println("Sunday");

}
else 
   System.out.println("Invalid number");





}
}
