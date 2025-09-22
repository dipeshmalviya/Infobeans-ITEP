import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mobile number : ");
        String mno = sc.nextLine();
        char []c=mno.toCharArray();

        // using wrapper class
        /*
         * for(char c1 : c){
         * boolean status= true;
         * Character c2=c
         * if(c2.isDigit(c)){
         * status = false;
         * break;
         * }
         * 
         * }
         * if(status){
         * System.out.println("valid name");
         * }
         * else{
         * System.out.println("Invalid name");
         * }
         * 
         */
       
        int l= mno.length();
        int l2=0;
        if(l==10){
             for(char c1 : c){
             Character c2=c1;
             if(c2.isDigit(c1)){
                l2++;
         }
         
         }
         if(l==l2){
         System.out.println("valid number");
         }
          else{
          System.out.println("Invalid number");
          }
        }
       

    
     else{
          System.out.println("Invalid number");
          }
}
}
