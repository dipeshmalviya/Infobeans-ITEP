/* 3. How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm?  */


import java.util.Scanner;
class Rectangle{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

int len=sc.nextInt();
int brea=sc.nextInt();
int clen=sc.nextInt();
int cbrea=sc.nextInt();
float tiles=(float)(clen*cbrea)/(len*brea);

System.out.println("Total tiles are:" +tiles);


}
}