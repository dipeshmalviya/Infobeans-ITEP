/* 8. WAP to check wheather number is even or odd */


import java.util.Scanner;
class Check{
public static void main(String []args){

Scanner sc=new Scanner (System.in);

System.out.println("Enter  number:");
int num=sc.nextInt();



if(num%2==0)
System.out.println("Number is EVEN");

else
System.out.println("Number is ODD");


}
}