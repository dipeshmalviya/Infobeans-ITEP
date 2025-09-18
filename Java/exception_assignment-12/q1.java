/*
 * 1. Divide by Zero Exception
 * 
 * 👉 Write a program that takes two numbers from the user and divides them.
 * Handle the case where the second number is zero.
 * 
 * // Expected
 * Enter first number: 10
 * Enter second number: 0
 * java.lang.ArithmeticException caught: / by zero
 */
import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("This program divide 2 integer number and give output:->>>>");
        System.out.println("Enter First number number: ");
        int f=sc.nextInt();
        System.out.println("Enter Second number: ");
        int s = sc.nextInt();
        try{
             System.out.println("result is :" + (f/s));
          }
        catch(ArithmeticException e){
           System.out.println( e.getClass().getName()+" Caught: "+e.getMessage());
        }
        
    }
}