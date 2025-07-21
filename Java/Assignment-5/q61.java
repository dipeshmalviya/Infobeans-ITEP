import java.util.Scanner;
class Leap{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a year range from: ");
int n1=sc.nextInt();

System.out.println("Enter a year range To: ");
int n2=sc.nextInt();
System.out.println("leap year between" +n1 +"to "+n2);

n1=n1+1;
n2=n2-1;

while(n1<=n2){

if(n1%100==0){
   if(n1%400==0){
    System.out.print(n1+" ");
n1++;}
    else{n1++;}
}
else if(n1%4==0){
    System.out.print(n1+" ");
n1++;
}

else{n1++;}

}



}
}