import java.util.Scanner;
class Series{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number how many terms you want (1 to 19): ");
int n=sc.nextInt();
int i=1;
long count=9l;
while(i<=n){
System.out.print(count +" ");
count=count*10+9;
i++;



}

}
}