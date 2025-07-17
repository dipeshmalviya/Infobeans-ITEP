/* 6.Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm. */
class Triangle
{
public static void main(String []args)
{
int s1=10,s2=9,peri=36;
int s3=peri-(s1+s2);
float sp=(s1+s2+s3)/2;
float AOT=(sp*(sp-s1)*(sp-s2)*(sp-s3));
double A=Math.sqrt(AOT);

System.out.println("Area of triangle is:" +A +"cm2");

}    
}