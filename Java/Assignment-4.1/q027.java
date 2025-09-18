//27) *	#	*	#	*	#	*	#	*	…….

import java.util.Scanner;
class Series{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter terms(Symbols) number you want: ");
    int n = sc.nextInt();
    int i = 1;
    while(n!=0){
        if(i%2==0)
      System.out.print("*" +" ");
        else
      System.out.print("#" +" ");
      i++;
      n--;
    }
  }
}