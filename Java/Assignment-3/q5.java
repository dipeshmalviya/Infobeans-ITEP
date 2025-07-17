import java.util.Scanner;
class Age{
public static void main(String []args){

Scanner sc=new Scanner(System.in);
System.out.println ("Enter age of 3 people only +ve no.");

int p1=sc.nextInt();//
int p2=sc.nextInt();
int p3=sc.nextInt();

if((p1>p2)||(p2>p3))
{
System.out.println("p1 is Oldest and p3 is Youngest");
}
else if((p2>p3)||(p3>p1))
{
System.out.println("p2 is Oldest and p3 is Oldest");
}
else if((p3>p1)||(p1>p2))
{
System.out.println("p3 is Oldest and p2 is Oldest");
}
else 
{
System.out.println("Equal");
}





}
}





