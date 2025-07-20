import java.util.Scanner;
class Table{
public static void main(String []args){

Scanner sc =new Scanner(System.in);

System.out.println("Printing table");
System.out.println("Enter number for table");

int n=sc.nextInt();
System.out.println("how many terms in table u want");

int t=sc.nextInt();
int i=1;
while(i<=t){
System.out.print(n +"X"+i +"=  " + i*n +"\n");
i++;

}

}
}