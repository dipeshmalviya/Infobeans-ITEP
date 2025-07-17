/*  7. WAP to find greater among three number */


import java.util.Scanner;
class Greater{
public static void main(String []args){

Scanner sc=new Scanner (System.in);

System.out.println("Enter first number:");
int num1=sc.nextInt();

System.out.println("Enter Second number:");
int num2=sc.nextInt();

System.out.println("Enter Second number:");
int num3=sc.nextInt();

if(num1>num2 && num1>num3)
System.out.println("number1 is greater: "+num1);
else if(num2>num1 && num2>num3)
System.out.println("number2 is greate: "+num2);
else if(num3>num1 && num3>num2)
System.out.println("number3 is greate: "+num3);
else

}
}