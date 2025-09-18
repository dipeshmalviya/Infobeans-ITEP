import java.util.Scanner;
public class pt89 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
   for(int i=1;i<num;i++){
           for(int k=1;k<=num-1;k++){
              System.out.print(" ");                
           }
              System.out.print(i);      
     System.out.println();
                      } 
    for(int j=1;j<=num;j++)  {
          System.out.print(j);      
    }
     for(int j=num-1;j>=1;j--)  {
          System.out.print(j);      
    }
     System.out.println();
    for(int i=num-1;i>=1;i--){
           for(int k=1;k<=num-1;k++){
              System.out.print(" ");                
           }
              System.out.print(i);      
     System.out.println();
                      } 


                
          
   }
}

