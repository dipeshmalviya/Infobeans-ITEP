import java.util.Scanner;
public class pt36 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
char c;
    for(int i=num;i>=1;i--){
        c=65;
        for(int j=i;j>=1;j--){
            if((i==j)||(i==num)||(j==1))
           System.out.print(c);
           else
        System.out.print(" ");

c++;
   }
   
       System.out.println();
              
 }
}
}

