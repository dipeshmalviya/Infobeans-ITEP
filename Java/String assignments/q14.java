/* 14) WAP check if a String contains only digits? */
import java.util.Scanner;

class Utility {
    Utility() {};
    public boolean isContainOnlyDigits(String str){
        int count=0;
            for(int i=0;i<str.length();i++){
              if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                count++;
              }
            }
       if(count==str.length()){
        return true;
       }
       else
       return false;
    }

   
}
class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utility u1 = new Utility();
        System.out.println("Enter a String Program application checks contains only digits or no");
        String string=sc.nextLine();
          boolean digits= u1.isContainOnlyDigits(string);
          if(digits)
        System.out.println("Only digits" );
        else
         System.out.println(" digits but other charater also");
    }
}