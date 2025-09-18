//4) WAP to print table of a number.

import java.util.Scanner;
class Table{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number you want Table : ");
    int n = sc.nextInt();
   int a;
   int i=1;
    while(i<=10){
       a=i*n;
      System.out.println(a);
      i++;
    }
  }
}