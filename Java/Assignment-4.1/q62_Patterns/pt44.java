import java.util.Scanner;
public class pt44 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
int temp=num;
   for(int i=1;i<=num;i++){
        for(int k=1;k<=temp-1;k++) 
            System.out.print(" ");
           for(int j=1;j<=i;j++)
           System.out.print(i);
        temp--; 
           
   
       System.out.println();
              
   }
}
}

