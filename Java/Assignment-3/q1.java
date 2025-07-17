import java.util.Scanner;
class Sqaure
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println ("Enter lenght and breadth of square");
int length=sc.nextInt();
int breadth=sc.nextInt();
if(length==breadth)
 System.out.println ("It is valid Sqaure");
else
 System.out.println ("It is not valid Sqaure");


}
}


