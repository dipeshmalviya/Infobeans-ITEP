/* 9. Find the area of an equilateral triangle, the length of whose sides is 12 cm. */

import java.util.Scanner;
class EquiTriangle{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int sides=sc.nextInt();
int Sqrno =3;
double sqr3 =Math.sqrt(Sqrno);
double AOET = (sqr3/4)*sides*sides;

System.out.println("Area of an equilateral triangle is:"+AOET);

}
}