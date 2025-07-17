/* 12. Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm. Find the length of the other side. */

import java.util.Scanner;
class Triangle
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

int hypo=sc.nextInt();
int perp=sc.nextInt();
int base=(hypo*hypo)-(perp*perp);
double AOT=Math.sqrt(base);

System.out.println("Base of triangle is:"+base);
System.out.println("Area of triangle is:"+AOT);



}
}