/* 38. The cylinder has a volume of 1287. The base has a radius 10. What is the area of the surface of the cylinder? */

import java.util.Scanner;
class Cylinder
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

int vol= sc.nextInt();
float rad =  sc.nextFloat();
float pie=3.14f;
float hei =(vol/(pie*rad*rad));
float SAC =(2*pie*rad)*(rad+hei);

System.out.println("Surface area of Cylinder is:"+ SAC);
}
}
