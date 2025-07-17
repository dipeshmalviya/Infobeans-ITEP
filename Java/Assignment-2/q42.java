/* 42. Find the Volume of Cylinder whose diameter and height are 2.25cm */


import java.util.Scanner;
class Cylinder 
{
public staic void main(String []args)
{
Scanner sc=new Scanner(System.in);

float d=sc.nextFloat();
float h= sc.nextFloat();
float pie = 3.14f

float r=(d/2);
float VOC =(2*pie *r*r* h);

System.out.println("Volume & Cylinder is:"+ VOC);
}
}

