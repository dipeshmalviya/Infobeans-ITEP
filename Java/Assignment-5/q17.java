import java.util.Scanner;
class Series{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number how many terms you want: ");
int n=sc.nextInt();
int i=1,a=1,c=0;

while(i<=n){

c=a+(i-1);
a=c;
System.out.print(c +" ");
i++;



}

}
}