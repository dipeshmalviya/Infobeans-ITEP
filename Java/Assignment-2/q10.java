/* 10. Find the area of an isosceles right angled triangle of equal sides 15 cm each. */

import java.util.Scanner;
class IsoRightTriangle
{
public static void main (String args[])
{ 
Scanner sc=new Scanner(System.in);

int side =sc.nextInt();
float AOT=(1/2.0f) * (side *side);

System.out.println("Area of an isosceles right angled triangle is:"+AOT);
}
}
