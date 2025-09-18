import java.util.Scanner;
public class pt27 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
    for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
           if(j==1)
           System.out.print("1");
            else if((i==j)&& (i%2!=0))
           System.out.print("0");


           else
           System.out.print(" ");

   }
       System.out.println();
              
 }
}
}

