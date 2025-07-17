/* 6.Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm. */



import java.util.Scanner;
class Triangle
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int s1=sc.nextInt();
int s2=sc.nextInt();
int peri=sc.nextInt();
int s3=peri-(s1+s2);
float sp=(s1+s2+s3)/2f;
float AOT=(sp*(sp-s1)*(sp-s2)*(sp-s3));
double A=Math.sqrt(AOT);

System.out.println("Area of triangle is:" +A +"cm2");

}    
}