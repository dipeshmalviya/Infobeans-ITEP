/* 18. Ron jogs around a rectangular park of length 50 m and breadth 30 m. If he takes 10 rounds of the park each day, how much distance does he cover in a day in km? */

import java.util.Scanner;
class Rectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int len= sc.nextInt();
int brea= sc.nextInt();
int round= sc.nextInt();

int distance = 2*(len+brea)*10;

System.out.println("Ron jogs distance is: "+ distance);
}
}