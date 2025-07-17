/* 7. Find the height of a triangle whose base is 50 cm and whose area is 500 cm².

import java.util.Scanner;
class Triangle{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

int base=sc.nextInt();
int AOT=sc.nextInt();
float hei=(2f*AOT)/base;

System.out.println("Height of triangle is:" +hei +"cm");


}
}