/* 1. WAP to calculate area of circle */

import java.util.Scanner;
class Circle{
public static void main(String []args){

Scanner sc=new Scanner (System.in);

System.out.println("Enter radius :");

float radius=sc.nextFloat();
float pie=3.14f;

float area_of_cicle= pie*radius*radius;

System.out.println("Area of Circle is:" +area_of_cicle);


}
}
