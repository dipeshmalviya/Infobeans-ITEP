/* 23. Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm. */
class Boxes {
public static void main(String args[]){

int side = 3, d1=15,d2=9, d3=12;
int cBoxes = (d1* d2*d3) / (side*side*side);

System.out.println("No. of cubical boxes is:"+cBoxes);
}
}