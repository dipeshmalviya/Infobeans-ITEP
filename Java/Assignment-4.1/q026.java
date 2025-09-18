//26) 0	8	64	216	…………
import java.util.Scanner;
class EvenCube{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Terms  number  that you want: ");
    int n = sc.nextInt();
    int i=0;
    while(n!=0){
      if(i%2 == 0)
        System.out.print((i*i*i) +" ");
      i++;
      n--;
    }
  }
}