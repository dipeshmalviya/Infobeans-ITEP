import java.util.Scanner;
class SCSQ{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a end number for square,cube and square root ");
int n=sc.nextInt();
int i=1;
System.out.println(" square,cube and square root form 1 to"+n);
while(i<=n){

System.out.println(" square of "+i +" is "+ (i*i));
System.out.println(" cube of "+i +" is "+ (i*i*i));
System.out.println(" square root of "+i +" is "+(Math.sqrt(i)));

i++;

}

}
}