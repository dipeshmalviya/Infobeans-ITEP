/* 19. A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has more volume? */

import java.util.Scanner;
class Volume
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int cubeE=sc.nextInt();
int cubol=sc.nextInt();
int cubow=sc.nextInt();
int cuboh=sc.nextInt();


int Vcube=cubeE*cubeE*cubeE;
int Vcuboi = cubol * cubow * cuboh;

System.out.println("volume of cube & cuboid is:" + Vcube+"  "+Vcuboi);

}
}
