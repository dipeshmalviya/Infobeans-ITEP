import java.util.Scanner;
public class pt3 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();

    for(int i=0;i<num;i++){
        for(int j=0;j<=i;j++){
            if(i==j)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
}
}

