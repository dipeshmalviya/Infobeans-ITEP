
/*
7. Custom Exception

👉 Create your own exception InvalidAgeException. If age < 18, throw the exception.

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}


Test in main:

if(age < 18) throw new InvalidAgeException("Not eligible for voting");
 */
import java.util.Scanner;
class InvalidAgeException extends Exception {
    
     InvalidAgeException(String msg) {
      super(msg);
 }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("eligible voter checker:->>>>");
        System.out.println("Enter age of voter");
        int age = sc.nextInt();
        try {
            if(age<18){
                throw new InvalidAgeException("Not eligible for voting");
            }
            else
                System.out.println("You are eligible");

        } catch (InvalidAgeException iae) {
            System.out.println(iae.getMessage());
           
        }
        System.out.println("bhai aakhri h yeh!!!");

    }
}