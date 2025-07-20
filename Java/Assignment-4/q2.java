import java.util.Scanner;
class Series{
public static void main(String []args){

Scanner sc =new Scanner(System.in);

System.out.println("Printing Series 1 to limit");
System.out.println("Set limit");

int n=sc.nextInt();
int i=1;
while(i<=n){
System.out.print(i +" ");
i++;

}

}
}