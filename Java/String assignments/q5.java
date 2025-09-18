/* Write a java program to reverse each word of String.
	Sample "Input: Java Is Plateform Independent"
	Output: "avaJ sI mrofetalP tnednepednI" 
*/import java.util.Scanner;
class Utility{
       public String reverse(String s){
              char c[]=s.toCharArray();
              char c2[]=new char[c.length];
              int j=0;
             for(int i=c.length-1;i>=0;i--){
                c2[j]=c[i];
                j++;
             }
           String  c3= new String(c2);
            return c3+" ";
        }
   
}
class TestMain{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        // String s="Java Is Plateform Independent";
        System.out.println("Enter String i give you every word in reverse ");
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        Utility w1= new Utility();
        for(int i=0;i<s1.length;i++){
            s =w1.reverse(s1[i]);
            System.out.print(s);       
        }       
       
    }
}