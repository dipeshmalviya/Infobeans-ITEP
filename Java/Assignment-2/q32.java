/* 32. A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25 m . Calculate the area of the garden. */

import java.util.Scanner;
class Square
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

int glen=sc.nextInt();
int slen = sc.nextInt();

int AOS = (slen*slen);

int AOG =(glen*glen)-AOS;

System.out.println("Area of garden is:"+AOG);
}
}
