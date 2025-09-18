/*2.Write a Java program to get the character
  at the given index within the
 String.
 */
import java.util.Scanner;
class Utility{
        Utility(){};
        public char atIndex(String s,int j){
            char c[]=s.toCharArray();
            for(int i=0;i<c.length;i++){
                if(i==j-1){
                    return c[i];
                }
            }
            return '0';
        }
}
class TestMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  String");
        String s = sc.nextLine();
        System.out.println("Enter index u want character");
        int i=sc.nextInt();
        Utility u= new Utility();
        char ch=u.atIndex(s,i);
        System.out.println("Character is : "+ch);

    }
}
