//21) 1,	4,	9,	16,	25	…..

import java.util.Scanner;

class Square{
  public static void main(String args[]){
    Scanner  sc = new Scanner(System.in);

    System.out.println("Enter terms you want : ");
    int n = sc.nextInt();
    int i = 1;
    while(n!=0){ 
        System.out.print((i*i) +" ");
        i++;
        n--;
    }

  }
}