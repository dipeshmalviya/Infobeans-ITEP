import java.util.Scanner;
class Discount
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println ("Enter quantity");
int quantity=sc.nextInt();
int unit=sc.nextInt();
if(quantity>1000){
   
  float discount=(quantity*100)/10;
 System.out.println ("quantity is greater than 1000");
System.out.println ("print total cost for user "+(quantity*100-discount));

}
else{
 System.out.println ("quantity is less than 1000");
System.out.println ("print total cost for user "+(quantity*100));
}



}
}


