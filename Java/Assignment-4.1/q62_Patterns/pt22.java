import java.util.Scanner;
public class pt22 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();

 char c;
    for(int i=1;i<=num;i++){
        c=65;
        for(int j=1;j<=i;j++){
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

