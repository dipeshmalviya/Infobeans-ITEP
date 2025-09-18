import java.util.Scanner;
public class pt1 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();

    for(int i=0;i<num;i++){
    System.out.print("*");

    }
}
}