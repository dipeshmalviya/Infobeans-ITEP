//22) 1	8	27	64	125	…..

import java.util.Scanner;

class Cube{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Terms no.  you wantd : ");
    int n = sc.nextInt();
    int i= 1;
    while(n!=0){
      System.out.print((i*i*i) +" ");
      n--;
      i++;
    }
  }
}