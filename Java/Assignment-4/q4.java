import java.util.Scanner;
class Series{
public static void main(String []args){

Scanner sc =new Scanner(System.in);

System.out.println("Printing sum of series");
System.out.println("Enter how many  sum you want");

int n=sc.nextInt();
int i=1,sum=0;
while(i<=n){
sum=sum+i;
System.out.print(sum +" ");
i++;

}

}
}