/* 16. Tina wants a new carpet for her rectangular dining room. Her dining room is a 5 meters by 7 meters rectangle. How much carpet does she need to buy to cover her entire dining room. */


import java.util.Scanner;
class Carpet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int Rlen =  sc.nextInt();
int Rb= sc.nextInt();
int AOR = Rlen*Rb;

System.out.println(  AOR +" meter carpet to Covever her entire dining rooms ");
}
}

