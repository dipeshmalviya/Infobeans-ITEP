//39) WAP to check whether entered number is strong or not

import java.util.Scanner;
class Strong  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number");
        int n=sc.nextInt();
        int temp=n;
        int temp1=temp;
       int count=0,a=0,b=1,sum=0;
        while (n!=0) {
            count++;    
            n=n/10;
        }
        n=0;
        int c=count;
        int c1=c;
        while (c!=0){
             a=temp%10;
             temp=temp/10;
        while (a!=0) {
            b=b*a;
            a--; 
        }
        sum=sum+b;
 count=c1;
        b=1;
          c--;
    }
        if(sum==temp1)
        System.out.println(" This   number  is Strong : "+sum);
        else
        System.out.println("This number is not strong "+temp1);

    }
 
    
}
