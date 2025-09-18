//23) 1	9	25	49	81	…..

import java.util.Scanner;
class OddSqaure{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter terms  number you want : ");
    int n = sc.nextInt();
    int i = 1;
    while(n!=0){
      if(i%2 != 0)
        System.out.print(( i*i) +" ");
        n--;
        i++;
      }
    }
  }
