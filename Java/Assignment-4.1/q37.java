import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number");
        int n=sc.nextInt();
        int temp=n;
        int r=0,a=0;
        while (n!=0) {
            a=n%10;
            n=n/10;
            r=r*10+a;
        }
        if(temp==r)
        System.out.println("Palindrome of this number is : "+r);
        else
        System.out.println("This number is not palindrome,"+temp);

    }
 
    
}
