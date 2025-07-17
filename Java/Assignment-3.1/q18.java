/*18. W.A.P to check whether given number is even or odd Without using % operator. */


import java.util.Scanner;
class Check{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
     System.out.println("Enter number:");
int num=sc.nextInt();
 if((num&1) ==0)
     System.out.println("even");
else
       System.out.println("odd");

}
}