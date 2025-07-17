/* 36. What is the surface area of a cylinder if the diameter is 15m height is 7m? */
class Cylinder {
public static void main(String args[]){

int dia = 15, hei= 7;
float pie=3.14f ;
float r =dia/2f;
float AOC = ((2* pie *r)*(r+hei));

System.out.println(" Surface Area of Cylinder is:"+ AOC);

}
}
