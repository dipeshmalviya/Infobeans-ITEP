/* 25. 100 bricks of length 24 cm and breadth 15 cm are used to tile a path of a garden. What is the area of the path? */

import java.util.Scanner;
class Brick
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

int bricks = sc.nextInt();
int len = sc.nextInt();
int brea= sc.nextInt();
int AOB = len*brea;
int AOG= AOB*bricks ;

System.out.println("path of garden area is:"+AOG +"cm^2");
}
}