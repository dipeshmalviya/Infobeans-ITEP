/*Q2. (3 Marks) – Logic Based (String)

Write a Java program to reverse each word in a string while keeping the word order same.
Example:

Input: "Java is very simple"
Output: "avaJ si yrev elpmis"
----------------------------------------------------------------------------------------- */
public class q2 {

    public static void main(String[] args) {
        
        String s1="Java is very simple";
               String arr[]  =s1.split(" ");
               String s2="";
               for(int i=0;i<=arr.length-1;i++){
                       String r=arr[i];
                      System.out.print(r+" ");
                       char c[]=r.toCharArray();
                     for(int j=c.length-1;j>=0;j--){
                              s2+=c[j];
                     }
                     s2+=" ";
               }
               System.out.println();
             System.out.print(s2);
    }
}