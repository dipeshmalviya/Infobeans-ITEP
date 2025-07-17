/* 3. WAP to calculate the percentage of students. */

import java.util.Scanner;
class Percentage{
public static void main(String []args){

Scanner sc=new Scanner (System.in);

System.out.println("Enter Total Marks :");

int total_marks=sc.nextInt();
System.out.println("Enter out of Total Marks :");
int out_total_marks=sc.nextInt();

float percentage=((float)total_mark/out_total_marks)*100f;

System.out.println("the percentage of students:" +percentage);


}
}
