/*23. Write a Java program to input day number and print week day. 
 */
import java.util.Scanner;
class WeekDay{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number =  sc.nextInt();
        int remainder = number % 7;
        System.out.println("remainder is: "+ remainder);
        if (remainder == 0){
            System.out.println("Sunday");
        } 
        else if(remainder == 1){
             System.out.println("Monday");
        }
        else if(remainder == 2){
             System.out.println("Tuesday");
        }
        else if(remainder == 3){
             System.out.println("Wednesday");
        }
        else if(remainder == 4){
             System.out.println("Thursday");
        }
        else if(remainder == 5){
             System.out.println("Friday");
        }
        else if(remainder == 6){
             System.out.println("Saturday");
        }
        else
        System.out.println("ohter wise ther is no week: ");
    }
}