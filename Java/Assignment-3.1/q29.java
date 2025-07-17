/*29. Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.
*/


import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first value");
        double first=sc.nextDouble();

        System.out.println("Enter the second value");
        double second=sc.nextDouble();

        System.out.println("Enter the operation");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':
               double add=first+second;
                System.out.println("Addition :"+add);
                break;
            case '-':
               double sub=first-second;
                System.out.println("Substraction :"+sub);
                break;
            case '>':
               if(first>second)
                System.out.println("First number is greater");
                else{
                System.out.println("second number is greater");
                }

                break;
            case '=':
                if(first==second)
                System.out.println("First number is equal to second number");
                else{
                    System.out.println("First number is not equal to second number");
                }
                break;
            default:
                System.out.println("Inavlid operator...");
        }
    }
}