/* 25. 100 bricks of length 24 cm and breadth 15 cm are used to tile a path of a garden. What is the area of the path? */
class Brick{
public static void main(String []args){

int bricks = 100, len = 24, brea= 15;
int AOB = len*brea;
int AOG= AOB*bricks ;

System.out.println("path of garden area is:"+AOG +"cm^2");
}
}