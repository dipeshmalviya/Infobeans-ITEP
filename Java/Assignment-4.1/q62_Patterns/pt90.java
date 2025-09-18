import java.util.Scanner;
public class pt90 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
   for(int i=1;i<=num;i++){
           for(int k=1;k<=num-i;k++){
              System.out.print(" ");                
           }
           for(int j=1;j<=2*i-1;j++){
              if((j)%2==0)
              System.out.print("0");                
              else
              System.out.print("1");                
           }
     System.out.println();
           }           
          
   }
}

