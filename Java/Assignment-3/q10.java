import java.util.Scanner;
class Leap{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
     System.out.println("Enter year:");
int num=sc.nextInt();



  if(num%100==0){
        
     if(num%400==0)
        System.out.println("leap year ");
     else
     System.out.println("not leap year ");
   
      
}
else{
    if(num%4==0)
         System.out.println("leap year ");
 else
System.out.println("not leap year ");
}

}
}