//58) WAP to convert decimal number into binary number without using array
//pending
import java.util.Scanner;
class Convert{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number(only integer)");
 int n=sc.nextInt();
 int i=1;
 int a=0,b=0,sum=1;
while(i<=n){
    a=n%2;
    b=n/2;
    sum=sum*a;
     System.out.print(sum);

i++;
}
 System.out.println("onvert decimal number into binary :"+sum);

}
}
//pending