import java.util.Scanner;
public class pt47 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
   for(int i=1;i<=num;i++){
        for(int k=1;k<=num-i;k++) 
            System.out.print(" ");
           for(int j=i;j<=i;j++){
           if((i==j)||(j==1)||(i==num)){
            System.out.print("1");
           }

            else
              System.out.print("*");

           }
      
           
       System.out.println();
              
   }
}
}
//pending

