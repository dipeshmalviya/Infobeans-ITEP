/* 3. How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm?  */
class Rectangle{
public static void main(String []args)
{
int len=13,brea=7,clen=520,cbrea=140;
int tiles=(clen*cbrea)/(len*brea);

System.out.println("Total tiles are:" +tiles);


}
}