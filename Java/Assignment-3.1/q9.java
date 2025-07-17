/* 9. WAP to check wheater number is positive or negative */


import java.util.Scanner;
class Check{
public static void main(String []args){

Scanner sc=new Scanner (System.in);

System.out.println("Enter  number:");
int num=sc.nextInt();



if(num>0)
System.out.println("Number is POSITIVE");

else if(num<0)
System.out.println("Number is NEGATIVE");
else
System.out.println("Neither positive nor negative");



}
}