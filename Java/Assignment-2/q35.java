/*  35. Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm. */

import java.util.Scanner;
class Cylinder 
{
public static void main (String []args)
{
Scanner sc=new Scanner(System.in);

float radi=sc.nextFloat();
float pie = 3.14f;
 int hei = sc.nextInt();

float SAC=(2*pie*radi)*(radi+hei);

System.out.println("Surface area of Cylinder is:"+ SAC);
}
}
