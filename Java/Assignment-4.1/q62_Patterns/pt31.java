import java.util.Scanner;
public class pt31 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
    for(int i=num;i>=1;i--){
        for(int j=1;j<=i;j++){

           System.out.print(j);

   }
       System.out.println();
              
 }
}
}

