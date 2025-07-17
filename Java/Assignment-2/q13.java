/* 13. The area of a right triangle is 184 cm² and one of its legs is 16 cm long. Find the length of other leg. */

import java.util.Scanner;
class Triangle
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

int AOT=sc.nextInt();
int base=sc.nextInt();

float hei=(2f*AOT)/base;

System.out.println("Height of triangle is:"+hei);


}
}