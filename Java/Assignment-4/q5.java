import java.util.Scanner;
class Series{
public static void main(String []args){

Scanner sc =new Scanner(System.in);

System.out.println("Printing +,- series");
System.out.println("Enter how many  terms you want");

int n=sc.nextInt();
int i=1,sum=0;
while(i<=n){
if(i%2==0){
System.out.print("-"+i +" ");
i++;
}
else{
 if(i==1)
System.out.print(i+" ");

 else
System.out.print("+"+i +" ");
i++;
}

}

}
}