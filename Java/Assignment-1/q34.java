/* 34. A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases. Calculate the area of the wooded area after the addition of the walkway. */
class Trapezoid{
public static void main(String []args) {

int base1=128, base2=92,hei=40,walk=4;
int AOT= (base1+ base2) * hei/2;
int AOW = hei*walk;
int AOWW = AOT - AOW;

System.out.println(" Area is :" + AOWW);
}
}
