//13) WAP to print N natural numbers in reverse order

import java.util.Scanner;
class Nnatural{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the N number : ");
    int i= sc.nextInt();
   
    while( i >= 1){
      System.out.println(i);
      i--;
    }
  }
}