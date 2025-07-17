/* 36. What is the surface area of a cylinder if the diameter is 15m height is 7m? */

import java.util.Scanner;
class Cylinder 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int dia = sc.nextInt();
int hei=  sc.nextInt();

float pie=3.14f ;
float r =dia/2f;
float AOC = ((2* pie *r)*(r+hei));

System.out.println(" Surface Area of Cylinder is:"+ AOC);

}
}
