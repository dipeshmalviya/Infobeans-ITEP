import java.util.Scanner;
public class pt13 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
   for(int i=0;i<=num;i++){
            if(i%2==0)
           for(int j=0;j<=i;j++)
            if(j%2==0)
            System.out.print("1");
            else
              System.out.print("0");
           
            else
            for(int j=0;j<=i;j++)
            if(j%2==0)
            System.out.print("0");
            else
              System.out.print("1");
          System.out.println();
           }           
          
   }
}

