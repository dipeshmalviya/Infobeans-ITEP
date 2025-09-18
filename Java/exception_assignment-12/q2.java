/*
 * 2. InputMismatchException
 * 
 * 👉 Ask the user to enter an integer. If the user enters text instead, catch
 * the exception.
 * 
 * // Expected
 * Enter an integer: abc
 * java.util.InputMismatchException caught
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number number");
        int f=sc.nextInt();
        System.out.println("Enter Second number");
        
     
        try{
            int s = sc.nextInt();
                  
        }
        catch(InputMismatchException e){
           System.out.println( e.getClass().getName()+" Caught");
        }
        
    }
}