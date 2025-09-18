/*
 * 6. Finally Block Practice
 * 
 * 👉 Open a Scanner, read an input, and always close the scanner in finally
 * (show that finally always executes).
 */
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        System.out.println("Scanner stream is open");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("try block executed");

        } catch (Exception e) {
            System.out.println(e.getClass().getName() + " Caught");
        }
       finally{
           System.out.println("final block executed");
        sc.close();
        System.out.println("Scanner stream is close");
       }

    }
}