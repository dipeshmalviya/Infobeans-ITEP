import java.util.Scanner;
public class pt42 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
    for(int i=1;i<=num;i++){
        for(int j=num;j>=i;j--){

           System.out.print(j);

   }
       System.out.println();
              
 }
}
}

