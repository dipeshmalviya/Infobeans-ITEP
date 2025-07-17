/* 1. The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area*/

import java.util.Scanner;
class Rectangle{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int peri=sc.nextInt();
int len=sc.nextInt();

float brea=(peri/2)-len;
float AOR=len*brea;
System.out.println("Breadth of rectangle is:" +brea +"cm");
System.out.println("Area of rectangle is:" +AOR +"cm");

}
}