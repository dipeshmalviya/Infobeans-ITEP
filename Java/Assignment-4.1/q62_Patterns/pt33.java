import java.util.Scanner;
public class pt33 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
    char c;
    for(int i=num;i>=1;i--){
        c=65;
        for(int j=i;j>=1;j--){
           System.out.print(c);
c++;
   }
       System.out.println();
              
 }
}
}

