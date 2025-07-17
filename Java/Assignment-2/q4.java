/* 4. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m.  */


import java.util.Scanner;
class Rectangle{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

int plen=sc.nextInt();
int pwide=sc.nextInt();
int cost=sc.nextInt();

float COT=((plen*pwide)/100f)*6;

System.out.println("Cost of tiling of plot is:" +COT +"$");

}
}