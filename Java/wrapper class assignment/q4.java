import java.util.Scanner;
class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
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
        System.out.println("Enter name : ");
        String name=sc.nextLine();
        name.trim();
        int l = name.length();
        System.out.println(l);
        int l2=0;
        char c[]=name.toCharArray();
        
        for(char c1:c){
         //  if(c1=='0'|| c1 == '1' || c1 == '2' || c1 == '3' || c1 == '4' || c1=='5'|| c1 == '6' || c1 == '7' || c1 == '8' || c1 == '9'){
         if(c1>='0' && c1<='9')  {
         break;
           }
           l2++;

           }
           if (l == l2) {
              System.out.println("Valid name");
        }
        else
            System.out.println("Invalid name");

    }
}
