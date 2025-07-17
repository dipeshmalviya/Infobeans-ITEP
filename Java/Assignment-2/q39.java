/* 39. Find the surface of the cylinder if its diameter is 12 centimeters and its height is 9 centimeters. */

import java.util.Scanner;
class Cylinder
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);

int dia = sc.nextInt();
int hei=sc.nextInt();

float r= dia/2f;
float pie = 3.14f;
float AOS = 2*pie*r* hei;

System.out.println (" Surface area cylinder is:"+AOS);
}}
