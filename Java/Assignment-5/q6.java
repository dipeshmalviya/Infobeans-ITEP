import java.util.Scanner;
class Factor{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
int n=sc.nextInt();
int i=1;
System.out.println("Now calculating factors ");
System.out.println("factors are");
while(i<=n){

if(n%i==0){
System.out.print(i +" ");
i++;
}
else
{i++;}
}



}
}