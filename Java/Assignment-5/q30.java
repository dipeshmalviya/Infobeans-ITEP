/*
import java.util.Scanner;
class Series{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number how many terms you want (1 to 19): ");
int n=sc.nextInt();
int i=1;
long count=1l;

while(i<=n){
if(i==1)
System.out.print(count);
else
System.out.print("+"+count);


count=count*10+1;
i++;



}

}
}





import java.util.Scanner;
class Series{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number how many terms you want (1 to 19): ");
int n=sc.nextInt();
int i=1;
long count=1l;

while(i<=n){

System.out.print(count "+");
count=count*10+1;
i++;



}

}
}
*/


import java.util.Scanner;
class Series{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number how many terms you want (1 to 19): ");
int n=sc.nextInt();
int i=1;
long count=0l;
long sum=0l;

while(i<=n){
count=count*10+1;
i++;
sum=sum+count;


}
System.out.print("Sum of series is:" +sum);

}
}











