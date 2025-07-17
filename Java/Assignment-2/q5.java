/*  5. If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.
 */


import java.util.Scanner;
class Rectangle{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int cost=sc.nextInt();
int len=sc.nextInt();
int pmsqr=sc.nextInt();
float brea=(cost-(len*pmsqr*1f))/pmsqr;
float peri=2*(len+brea);
float AOP=len*brea;

System.out.println("breadth of park is:" +brea +"cm");
System.out.println("perimeter of park is:" +peri +"cm");
System.out.println("Area of park is:" +AOP +"cm2");

}
}