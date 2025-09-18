//5) WAP to find out the factorial of a number.

import java.util.Scanner;
class Factorial{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    int i = 1;
    int fac = 1;
    while(n!=0){
      fac = fac*i;
   
      i++;
      n--;
    }
       System.out.println("FActorial of this number is:"+fac);
  }
}