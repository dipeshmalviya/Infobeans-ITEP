/* 2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter.  */
class Rectangle{
public static void main(String []args)
{
int AOR=96,brea=8;
int len,peri;
len=AOR/brea;
peri=2*(len+brea);

System.out.println("length of rectangle is:" +len +"cm");
System.out.println("perimeter of rectangle is:" +peri +"cm");

}
}