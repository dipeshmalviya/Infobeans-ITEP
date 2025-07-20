import java.util.Scanner;
class Series{
public static void main(String []args){

Scanner sc =new Scanner(System.in);

System.out.println("Printing Squares of numbers");
System.out.println("Enter how many terms you want");

int n=sc.nextInt();
int i=1;
while(i<=n){
System.out.print(i*i +" ");
i++;

}

}
}