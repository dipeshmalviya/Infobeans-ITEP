/* 2. WAP to calculate area of rectangle */

import java.util.Scanner;
class Rectangle{
public static void main(String []args){

Scanner sc=new Scanner (System.in);

System.out.println("Enter length and breadth :");

int length=sc.nextInt();
int breadth=sc.nextInt();

int area_of_rectangle= length*breadth;

System.out.println("Area of Rectangle is:" +area_of_rectangle);


}
}
