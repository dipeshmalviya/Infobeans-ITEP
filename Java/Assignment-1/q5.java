/*  5. If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.
 */
class Rectangle{
public static void main(String []args)
{
int cost=1600,len=20,pmsqr=25;
int brea=(cost-(len*pmsqr))/pmsqr;
int peri=2*(len+brea);
int AOP=len*brea;

System.out.println("breadth of park is:" +brea +"cm");
System.out.println("perimeter of park is:" +peri +"cm");
System.out.println("Area of park is:" +AOP +"cm2");

}
}