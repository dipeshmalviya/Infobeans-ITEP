/*22. Write a Java program to check whether a number is divisible by 5 and 11 or not. 
 */

import java.util.Scanner;
class Divisible{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = sc.nextInt();
        if((number % 5 == 0) && (number % 11 == 0)){
            System.out.println("number is divisible by 5 and 11");

        }else
        System.out.println("number is not divisible by 5 and 11");
    }
}