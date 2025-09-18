//40) WAP to count no. Of even and odd digits in a number

import java.util.Scanner;
class CountDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number");
        int n=sc.nextInt();
        int evenc=0,oddc=0;
        int a=0;
        while (n!=0) {
            a=n%10;
            if(a%2==0)
            evenc++;
            else
            oddc++;
            n=n/10;
        }
 System.out.println("Total even digit in anumber is:"+evenc); 
System.out.println("Total even digit in anumber is:"+oddc);

    }
}