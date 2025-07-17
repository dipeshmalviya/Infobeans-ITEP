/* 20. What is the volume of a brick of ice-cream with length 25 cm, breadth 10 cm and height 8 cm? */

import java.util.Scanner;
class Volume
{
public static void main (String []args)
{
Scanner sc=new Scanner(System.in);

int l=sc.nextInt();
int b=sc.nextInt();
int h=sc.nextInt();
int Vbrick = l*b*h;

System.out.println("volume of a brick of ice-ice-cream is:" + Vbrick);
}
}
