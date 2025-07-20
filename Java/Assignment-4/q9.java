
import java.util.Scanner;
class FibonacciSeries
{
public static void main(String []args){
 Scanner sc=new Scanner(System.in);
System.out.println("Enter a number how many terms you want:");
 int n=sc.nextInt();
int i=1,a=1,b=2,c=1;

while(i<=n){
 
if(i==1){

System.out.print(c +" ");//a
i++;
}
else if(i==2){

System.out.print(++c +" ");//b

i++;
}
else {
c=a*b;
System.out.print(c +" ");

a=b;
b=c;
i++;	
}
}

}
}