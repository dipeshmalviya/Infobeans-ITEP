import java.util.Scanner;
class Counter{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int i=1;
int count=0;
while(i<=n){
count++;
i=i/10;
}
System.out.println("total digit is equal" +count);
}
}