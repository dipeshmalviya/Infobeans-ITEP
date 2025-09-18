import java.util.Scanner;
public class pt25 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
int count;
    for(int i=1;i<=num;i++){
        count=num;
        for(int j=1;j<=i;j++){
           System.out.print(count);
   count--;

   }
       System.out.println();
              
 }
}
}

