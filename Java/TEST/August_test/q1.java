import java.util.Scanner;
class Utility{
    public boolean toCheckPrime(int num){
        int i;
        for(i=2;i<num/2;i++){
              if(i%2==0)
              break;
        }
        if(i>=num/2)
        return true;
        else
        return false;
    }


}
 class TestMain{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Utility u1=new Utility();
       boolean isPrime= u1.toCheckPrime(num);
         if(isPrime){
            System.out.println("prime number");
         }
         else
         System.out.println("not prime");
    }
}