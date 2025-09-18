import java.util.Scanner;
class Armstrong  {
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
        int c=count;
        int c1=c;
        while (c!=0){
             a=temp%10;
             temp=temp/10;
        while (count!=0) {
            b=b*a;
            count--; 
        }
        sum=sum+b;
                System.out.println("sum : "+sum);
 count=c1;
        b=1;
          c--;
    }
        if(sum==temp1)
        System.out.println("Armstrong  of this number is : "+sum);
        else
        System.out.println("This number is not Armstrong "+temp1);

    }
 
    
}
