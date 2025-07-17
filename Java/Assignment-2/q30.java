/* 30. How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide? */

import java.util.Scanner;
class Floor
{
public static void main (String args[]) 
{
Scanner sc=new Scanner(System.in);

int tlen=sc.nextInt();
int tbrea=sc.nextInt();
int rlen=sc.nextInt();
int rbrea=sc.nextInt();


float tiles = (float)(rlen*rbrea) / (tlen * tbrea);

System.out.println("required tiles is:"+tiles);
}
}