
import java.util.Scanner;
class FibonacciSeries
{
public static void main(String []args){
 Scanner sc=new Scanner(System.in);
System.out.println("Enter a number how many terms you want:");
 int n=sc.nextInt();
int i=0,a=0,b=1,c=0;

while(i<=n){

if(i==0){

System.out.print(c +" ");//a
i++;
}
else if(i==1){

System.out.print(++c +" ");//b
c--;
i++;
}
else {
c=a+b;
System.out.print(c +" ");

a=b;
b=c;
i++;	
}
}

}
}