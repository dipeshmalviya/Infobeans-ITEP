import java.util.Scanner;
class Company
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println ("Enter salary(Annualy) and year of service");
int salary=sc.nextInt();
int year=sc.nextInt();
if(year>5){
 System.out.println ("year of service is greater than grater than 5 ");
 System.out.println ("net bonus amount is:"+(salary*0.05f) );


}
else
 System.out.println ("Not elibigle for bonous");


}
}


