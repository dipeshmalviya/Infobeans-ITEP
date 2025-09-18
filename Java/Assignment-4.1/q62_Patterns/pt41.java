import java.util.Scanner;
public class pt41 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();

    char c=65;
    for(int i=0;i<num;i++){
       
        for(int j=0;j<=i;j++){
           
            System.out.print(c);
         c++;
        }
          
        System.out.println();
              
    }
}
}

