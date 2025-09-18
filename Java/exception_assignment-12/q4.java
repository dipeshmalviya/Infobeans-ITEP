/*
 * 4. NullPointerException
 * 
 * 👉 Declare a String = null. Try to call length() on it. Handle the exception.
 * 
 * // Expected
 * java.lang.NullPointerException caught
 */
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String s=null;

        try {
          s.length();
          

        } catch (NullPointerException npe) {
            System.out.println(npe.getClass().getName() + " Caught");
        }
    }
}