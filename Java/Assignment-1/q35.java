/*  35. Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm. */
class Cylinder {
public static void main (String []args){

float radi=7.7f, pie = 3.14f;
 int hei = 12;
float SAC=(float)((2*pie*radi)*(radi+hei));

System.out.println("Surface area of Cylinder is:"+ SAC);
}
}
