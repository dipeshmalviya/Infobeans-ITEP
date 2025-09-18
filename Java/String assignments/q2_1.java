/* 1. Write a Java program to concatenate Two strings */
import java.util.Scanner;
class Utility{
     Utility(){};
    public String concateString(String f,String s){
      //  char f1[]=f.toCharArray();
       // char s1[]=s.toCharArray();
        return f+s;
    }

}
class TestMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first String");
        String fs=sc.nextLine();
        System.out.println("Enter a first String");
        String ss = sc.nextLine();
        Utility u1= new Utility();
        String concat =u1.concateString(fs,ss);
        // String concat =u1.concaString(fs, ss); predefine
        System.out.println("After concatenate String is : "+concat);


    }
}