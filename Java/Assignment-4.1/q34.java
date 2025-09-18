import java.util.Scanner;
class Perfect{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int i=1,p=0;
while(i<n){
if(n%i==0)
p=p+i;
i++;
}
if(n==p)
System.out.println(n +" Perfect number");
else
System.out.println(n +" Is not Perfect number");
}
}