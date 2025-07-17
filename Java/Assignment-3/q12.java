import java.util.Scanner;
class Reverse{
public static void main(String []args){
Scanner sc=new Scanner (System.in);
System.out.println("Enter four digit number:");
int num=sc.nextInt();
if(num>=1000 && num<=9999){
int r1=num%10;
num=num/10;
int r2=num%10;
num=num/10;
int r3=num%10;
num=num/10;
int rnumber=(r1*1000)+(r2*100)+(r3*10)+num;
System.out.println("Reverse number is:"+rnumber);
}
else
System.out.println("Number should four digit");





}
}
