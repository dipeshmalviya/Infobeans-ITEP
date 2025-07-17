/* 8. Find the base of a triangle whose altitude is 20 cm and area is 0.8 m². */


import java.util.Scanner;
class Triangle{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

int alti=sc.nextInt();
float AOT=sc.nextFloat();

float base=(2*AOT)/alti;


System.out.println("Base of triangle is:" +base +"cm");


}
}