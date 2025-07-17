/* 34. A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases. Calculate the area of the wooded area after the addition of the walkway. */

import java.util.Scanner;
class Trapezoid
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

int base1=sc.nextInt();
int base2=sc.nextInt();
int hei=sc.nextInt();
int walk=sc.nextInt();

float AOT= (base1+ base2) * hei/2f;
float AOW = hei*walk;
float AOWW = AOT - AOW;

System.out.println(" Area is :" + AOWW);
}
}
