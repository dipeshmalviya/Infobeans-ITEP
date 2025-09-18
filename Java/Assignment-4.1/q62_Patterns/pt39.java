import java.util.Scanner;
public class pt39 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number for pattern :");
    int num=sc.nextInt();
int temp=num;
    for(int i=num;i>=1;i--){
        if(i%2==0)
        for(int p=1;p<=temp;p++)  {
           System.out.print(p); 
          if(p>temp){
            temp--;
            break;
          }
      
    }
      else{
      for(int k=temp;k>=1;k--){
        System.out.print(k);
          if(k<1){
            temp--;
          break;
      }
   }
       }     System.out.println();
       temp--;


              
}
}
}


