import java.util.Scanner;
class Series{
public static void main(String []args){

Scanner sc =new Scanner(System.in);

System.out.println("Printing sum of series");
System.out.println("Enter how many terms sum you want");

int n=sc.nextInt();
int i=1;
float sum=0f;
while(i<=n){
sum=sum+(1f/i);
//System.out.print(sum +" ");
i++;

}
System.out.print(sum +" ");

}
}