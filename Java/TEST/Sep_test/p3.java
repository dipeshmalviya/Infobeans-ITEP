/*
 * 3. String Problem #1
 * 
 * Find First Non-Repeating Character
 * 
 * Write a program that takes a string input and returns the first character
 * that does not repeat.
 * 
 * If all characters repeat, return "None".
 * 
 * Example:
 * 
 * Input: "swiss" → Output: "w"
 * 
 * Input: "aabbcc" → Output: "None"
 */
import java.util.Scanner;
class Utility{
    Utility(){}
    public  void Repeating(String word){
        char c1[]=word.toCharArray();
         boolean status[]=new boolean[c1.length];
         int i=0;
         status[i] = false;
         int count = 1;
         for(i=0;i<c1.length;i++){
                
             for(int j=0;j>c1.length;j++){
                if(c1[i]==c1[j]){
                    status[i]=true;
                    continue;
                }
                else if(status[j]){
                     count++;
                }
             }
            

         }
         if (count == 1) {
             System.out.println(c1[i]);
         } else
             System.out.println("none");
    }

}
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 
        System.out.println("Entr a String");
        String word=sc.nextLine();

        Utility u1=new Utility();
        u1.Repeating(word);

    }
}