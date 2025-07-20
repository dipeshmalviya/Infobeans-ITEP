import java.util.Scanner;
class Series{
public static void main(String []args){

Scanner sc =new Scanner(System.in);

System.out.println("Printing ODD series");
System.out.println("Enter how many  terms you want");

int n=sc.nextInt();
int i=1,odd=1;
while(i<=n){

System.out.print(odd +" ");
odd=odd+2;
i++;


}

}
}