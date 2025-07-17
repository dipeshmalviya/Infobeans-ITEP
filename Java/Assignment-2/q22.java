/* 22. A pond is 50 m long, 30 m wide and 2 m deep. Find the capacity of the pond in cubic metre.  */

import java.util.Scanner;
class Pond
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int l=sc.nextInt();
int w=sc.nextInt();
int d=sc.nextInt();
int capacity = (l*w*d);

System.out.println("Capacity of pond is:"+ capacity);

}
}