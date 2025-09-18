//24) 0	4	16	36	64	….. 1 2 3 4 5 6 7 8
import java.util.Scanner;
class EvenSquare{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter  terms you want number : ");
    int n = sc.nextInt();
    int i = 0;
    while(n!=0){
       if(i%2 == 0)
         System.out.print((i*i) +" ");
    n--;
    i++;
    }
    i=1;
    System.out.print(".....");
    while(i<=8){
        System.out.print(i +" ");
i++;
    }

  }
}