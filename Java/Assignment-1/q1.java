/* 1. The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area*/


class Rectangle{
public static void main(String []args)
{
int peri=230,len=70;
int brea=(peri/2)-len;
int AOR=len*brea;
System.out.println("Breadth of rectangle is:" +brea +"cm");
System.out.println("Area of rectangle is:" +AOR +"cm");

}
}