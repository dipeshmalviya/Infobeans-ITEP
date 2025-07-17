/* 28. A carpet is 5 m long and 4 m wide. Find its price at the rate of $ 205 per square meter. */

import java.util.Scanner;
class Carpet
{
public static void main(String []args) 
{
Scanner sc=new Scanner(System.in);

int lon=sc.nextInt();
int wide=sc.nextInt();
int rate=sc.nextInt();

int price=lon*wide*rate;
System.out.println("price of carpet is: "+ price);
}
}