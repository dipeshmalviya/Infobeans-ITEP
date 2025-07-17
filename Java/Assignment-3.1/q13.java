/* 13. Program to perform arithmetic operation using switch case
 */


import java.util.Scanner;
class Check{
public static void main(String []args){

Scanner sc=new Scanner (System.in);
System.out.println("Enter  number1:");
int a=sc.nextInt();

System.out.println("Enter  number2:");
int b=sc.nextInt();


System.out.println("Enter  arithmetic operater symbol:");
char ch=sc.next().charAt(0);
switch(char){
case '+':
System.out.println("Addition is:"+(a+b));
break;
case '-':
System.out.println("substraction is:"+(a-b));
break;
case '*':
System.out.println("multiply is:"+(a*b));
break;
case '/':
System.out.println("Division is:"+(a/b));
break;
case '%':
System.out.println("Addition is:"+(a%b));
break;
default:
System.out.println("Invalid operator");




}




}
}