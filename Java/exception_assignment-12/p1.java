/*
 * 1. Banking System – Insufficient Balance
 * 
 * You are building a banking system. A user tries to withdraw more money than
 * available in their account.
 * 
 * Which exception would you throw?
 * 
 * Will you use a checked or unchecked exception? Why?
 * 
 * Write a custom exception InsufficientBalanceException.
 */
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Insufficient Balance");
    }
}
 class Account {
     private int bal;

     public Account() {
         bal = 10000;
     }

     public void deposite(int amount) {
         bal += amount;
    }

    public void withdrawal(int amount) throws InsufficientBalanceException {
        if (amount > bal)
            throw new InsufficientBalanceException();
        else {
            bal = bal - amount;
            System.out.println("Witdrawal Success...");
        }

    }

    public int getBal() {
        return bal;
    }
}

class Bank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Account a1 = new Account();
        a1.deposite(50000);
        System.out.println("Available Balance : " + a1.getBal());
        System.out.println("Enter amount");
        int amount = sc.nextInt();
        try {
            a1.withdrawal(amount);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
        System.out.println("Avaialble Balance : " + a1.getBal());
        System.out.println("------------------------------------------");

    }
}
