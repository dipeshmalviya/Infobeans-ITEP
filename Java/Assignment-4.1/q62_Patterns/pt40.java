import java.util.Scanner;
public class pt40 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();

   int plus=1;
    for(int i=1;i<=num;i++){
        for(int j=1;j<=plus;j++){
            System.out.print("*");
        }
        plus=plus+i;
        System.out.println();
       
    }



}
}