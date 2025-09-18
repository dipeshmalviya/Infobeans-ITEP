import java.util.Scanner;
public class pt38 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();

    for(int i=num;i>=1;i--){
        for(int j=i;j>=1;j--){
            if((i==j)||(i==num)||(j==1))
           System.out.print(i);
           else
        System.out.print(" ");


   }
   
       System.out.println();
              
 }
}
}

