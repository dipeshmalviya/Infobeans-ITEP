/*  5. WAP to exchange value of two variable without using third variable and arithmetic operator */


import java.util.Scanner;
class Exchange{
public static void main(String []args){

Scanner sc=new Scanner (System.in);

System.out.println("Enter first number:");
int num1=sc.nextInt();

System.out.println("Enter Second number:");
int num2=sc.nextInt();

System.out.println("num1:"+num1 +"num2:"+num2);
/*
int temp=num1;
num1=num2;
num2=temp;


System.out.println("exchangeing numbers :" );
System.out.println("num1:"+num1 +"num2:"+num2);
*/

System.out.println("Without third variable and arithmetic operator :" );
num1=num1^num2;
num2=num1^num2;
num1=num1^num2;

System.out.println("num1:"+num1 +"num2:"+num2);


}
}