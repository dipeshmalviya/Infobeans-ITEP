import java.util.Scanner;
class Series{
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
//System.out.println("Printing table");
//System.out.println("Enter number for table");
System.out.println("how many terms in  u want");
int n=sc.nextInt();
int t=7;
int i=0;
while(n!=0){
System.out.print( i*t +" ");
i++;
n--;

}

}
}