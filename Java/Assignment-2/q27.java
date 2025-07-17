/*  27. Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m. */

import java.util.Scanner;
class Room
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int lon=sc.nextInt();
int wide=sc.nextInt();
int rate =sc.nextInt();

int COT = lon *wide * rate;

System.out.println("Cost of room is: "+ COT);
}
}

