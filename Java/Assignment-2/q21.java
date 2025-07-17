/* 21. A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres? */

import java.util.Scanner;
class Wall
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);

int blen=sc.nextInt();
int bbrea= sc.nextInt();
int bhei= sc.nextInt();

int wlen=sc.nextInt();
int wbrea=sc.nextInt();
int whei=sc.nextInt();


float tBrick = (float)(wlen*wbrea*whei) / (blen*bbrea*bhei);

System.out.println("Total bricks is:"+tBrick);
}
}