/*
 * 5. Multiple Catch Blocks
 * 
 * 👉 Take two integers and perform division. Handle both ArithmeticException
 * and InputMismatchException separately.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program divide 2 integer number and give output:->>>>");
        System.out.println("Enter First number number");
        int f = sc.nextInt();
        System.out.println("Enter Second number");

        try {
            int s = sc.nextInt();
            System.out.println("result is :" + (f / s));

        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName() + " Caught");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + " Caught: " + e.getMessage());
        }

    }
}