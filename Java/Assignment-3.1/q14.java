/* 14. WAP to find lowest number among four different number
 */


import java.util.Scanner;
class Check{
public static void main(String []args){

Scanner sc=new Scanner (System.in);
System.out.println("Enter  number1:");
int num1=sc.nextInt();

System.out.println("Enter  number2:");
int num2=sc.nextInt();
System.out.println("Enter  number3:");
int num3=sc.nextInt();
System.out.println("Enter  number4:");
int num4=sc.nextInt();

if(num1>num2 && num1>num3 && num1>num4)
System.out.println(" number1 is greater:"+num1);
else if(num2>num1 && num2>num3 && num2>num4)
System.out.println(" number2 is greater:"+num1);
else if(num3>num1 && num3>num2 && num3>num4)
System.out.println(" number3 is greater:"+num1);

else if(num4>num1 && num4>num2 && num4>num3)
System.out.println(" number1 is greater:"+num1);





}




}
}