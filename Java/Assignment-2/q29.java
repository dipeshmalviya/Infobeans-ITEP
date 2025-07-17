/* 29. How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm? */

import java.util.Scanner;
class Square
{
public static void main(String []args) 
{
Scanner sc=new Scanner(System.in);
 
int side =sc.nextInt();
int flen = sc.nextInt();
int fbrea=sc.nextInt();

float tiles = (float)(flen*fbrea)/ (side * side);

System.out.println(" Square tiles is: "+ tiles);
}
}
