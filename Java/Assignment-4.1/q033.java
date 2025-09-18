//33) WAP to print Alphabets in reversing order.
import java.util.Scanner;
class RAlphabets{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i = 90;
    while(i >= 65){
      char ch = (char)i;
      System.out.print(ch +" ");
      i--;
    }
  }
}

