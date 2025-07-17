/* 26. How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide? */
class Brick{
public static void main (String []args){

int plon=120*100, blon=24, bbrea=15;
float pbrea=2.4f*100;
float rbrick = (float)(plon*pbrea)/(blon*bbrea);

System.out.println("bricks required to lay path is:"+rbrick);
}
}
