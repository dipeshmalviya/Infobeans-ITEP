import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number");
        int n=sc.nextInt();
        int r=0,a=0;
        while (n!=0) {
            a=n%10;
            n=n/10;
            r=r*10+a;
        }
        System.out.println("Reverse of this number is : "+r);
 
    }
}