/* 40. Calculate the volume of the cylinder: r = 5 cm, h = 9 cm */


import java.util.Scanner;
class Cylinder
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);

int r=sc.nextInt();
int h=sc.nextInt();
float pie= 3.14f;
float VOC = pie*2*r*h;

System.out.println("volume of the Cylinder is:"+VOC);
}
}

