/* 9. Find the area of an equilateral triangle, the length of whose sides is 12 cm. */
class EquiTriangle{

public static void main(String args[]){

int sides=12;
double Sqr3 = 1.732;

double AOET = (Sqr3/4)*sides*sides;

System.out.println("Area of an equilateral triangle is:"+AOET);

}
}