/*  6. WAP to find greater among two number */


import java.util.Scanner;
class Greater{
public static void main(String []args){

Scanner sc=new Scanner (System.in);

System.out.println("Enter first number:");
int num1=sc.nextInt();

System.out.println("Enter Second number:");
int num2=sc.nextInt();

if(num1>num2)
System.out.println("number1 is greater: "+num1);
else if(num2>num1)
System.out.println("number2 is greate: "+num2);
else
System.out.println("number1 and number2 are equal is greater"+num1 +" "+num2);


}
}