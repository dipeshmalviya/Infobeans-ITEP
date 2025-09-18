import java.util.Scanner;
class Series{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
      int i=65;
      while (n!=0) {
        if(i%2==0)
        System.out.printf("%c ",i+32);
       else
       System.out.printf("%c ",i);
       i++;
       n--; 
      }
       
      }

    }
