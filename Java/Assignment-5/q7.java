import java.util.Scanner;
class Factor{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
int n=sc.nextInt();
int i=2;
while(i<=n)
{
 if(n==2) break;
else if(n%i==0){ break; }
 i++;
}

if(i==n)
System.out.print("prime");

else
System.out.print(" Not prime");

}
}		