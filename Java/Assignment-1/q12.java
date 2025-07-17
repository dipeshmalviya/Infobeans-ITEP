/* 12. Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm. Find the length of the other side. */
class Triangle{
public static void main(String []args){
int hypo=13,perp=12;
int base=(hypo*hypo)-(perp*perp);
double AOT=Math.sqrt(base);

System.out.println("Base of triangle is:"+base);
System.out.println("Area of triangle is:"+AOT);



}
}