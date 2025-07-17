/* 4. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m.  */
class Rectangle{
public static void main(String []args)
{
int plen=300,pwide=150,cost=6;
int COT=((plen*pwide)/100)*6;

System.out.println("Cost of tiling of plot is:" +COT +"$");

}
}