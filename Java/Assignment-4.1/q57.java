//57) WAP to print all the prime numbers between two entered numbers

import java.util.Scanner;
class CheckPrime{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a  ending number ");
int n1=sc.nextInt();
System.out.println("Enter a  ending number ");
int n2=sc.nextInt();

int i=2;

while(n1<=n2)
{
 if(n1==2) break;
else if(n1%i==0){ break; }
 i++;
 n1++;


 if(i==n1)
System.out.print("prime");
}





}
}		