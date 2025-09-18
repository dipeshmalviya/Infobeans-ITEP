//16) …... -6	-3	0	3	6	9	……. n terms	 

import java.util.Scanner;
class Series{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a terms you want : ");
    int terms = sc.nextInt();
    //terms=terms*3;
    int toterms=-(terms);
    terms=terms+3;
    while(toterms <= terms){
      System.out.print(toterms +" ");
      toterms=toterms+3;
    }
  }
}