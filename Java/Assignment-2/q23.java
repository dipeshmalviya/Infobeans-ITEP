/* 23. Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm. */

import java.util.Scanner;
class Boxes 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int side = sc.nextInt();
int d1=sc.nextInt();
int d2=sc.nextInt();
int d3=sc.nextInt();
float cBoxes = (float)(d1* d2*d3) / (side*side*side);

System.out.println("No. of cubical boxes is:"+cBoxes);
}
}