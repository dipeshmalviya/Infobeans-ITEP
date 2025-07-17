/*24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall? */

import java.util.Scanner;
class Wall
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int blon=sc.nextInt();
int bhei=sc.nextInt();
int wlon=sc.nextInt();
int whei = sc.nextInt();
int rate=sc.nextInt();


float bthic = sc.nextFloat();
float wthic=sc.nextFloat();


double cost = (((wlon*whei*wthic)/(blon*bhei*bthic)) /1000)*rate;

System.out.println("Cost of wall is:" + cost +"$");
}
}