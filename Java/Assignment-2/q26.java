/* 26. How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide? */
class Brick{

import java.util.Scanner;
class Brick
{
public static void main (String []args)
{
Scanner sc=new Scanner(System.in);

int plon=sc.nextInt();
int blon=sc.nextInt();
int bbrea=sc.nextInt();

float pbrea=sc.nextFloat();

float rbrick = (plon*pbrea)/(blon*bbrea);

System.out.println("bricks required to lay path is:"+rbrick);
}
}
