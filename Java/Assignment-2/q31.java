/* 31. What will be the area of a square with perimeter 200 m? */


import java.util.Scanner;
class Square
{
public static void main (String []args)
{
Scanner sc=new Scanner(System.in);

int peri =sc.nextInt();

//P=4xside
float side = (peri/4f);
float AOS= side*side;

System.out.println("Area & Square is: " + AOS);
}
}
