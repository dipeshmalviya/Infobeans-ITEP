/*Problem 4: Banking System 
Abstract class BankAccount:
accountNumber, balance fields
abstract methods: deposit(), withdraw()
concrete method showBalance()
Subclasses:
SavingsAccount (cannot withdraw below ₹1000)
CurrentAccount (no min balance required)
Interface LoanEligible with method checkLoanEligibility().
Only SavingsAccount is loan eligible.
*/
 interface LoanEligible{
    void checkLoanEligibility();
    
}
abstract class BankAccount{
     private long accountNumber;
     private double balance;
     BankAccount(){};
     BankAccount(long accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
     };
     abstract public void deposit(int amount);
     abstract public void withdraw(int amount);
     public void setBalance(double balance) {
         this.balance = balance;
     }
     public long getAccountNumber() {
         return accountNumber;
     }
     public double getBalance() {
         return balance;
     }
     
}
class SavingsAccount extends BankAccount implements LoanEligible{
    SavingsAccount(){};
    SavingsAccount(long accountNumber,double balance){
        super(accountNumber,balance);
    };
    public void deposit(int amount) {
        if(amount>0){
            setBalance(getBalance()+amount);
            System.out.println(amount +"$ is successfully deposited");
        }
        else{
            System.out.println("Invaild amount");
        }
    }
    public void withdraw(int amount){
        if(getBalance()-amount>1000){
              setBalance(getBalance()-amount);
              System.out.println(amount +"$ is successfully withdraw");
        }
        else{
            System.out.println("Insufficient amount because it is saving account");
        }
    }
    public void  checkLoanEligibility(){
        if(getBalance()>10000){
            System.out.println(  "You're Eligible for loan");
        }
        else{
            System.out.println("you're not Eligible for loan");
        }
    }

}

class CurrentAccount extends BankAccount{
    CurrentAccount(){};

    CurrentAccount(long accountNumber,double balance){
        super(accountNumber,balance);
    };
    public void deposit(int amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println(amount + "$ is successfully deposited");
        } else {
            System.out.println("Invaild amount");
        }
    }

    public void withdraw(int amount){
        if(getBalance()-amount>1000){
              setBalance(getBalance()-amount);
              System.out.println(amount +"$ is successfully withdraw");
        }
        else{
            System.out.println("Insufficient amount because it is saving account");
        }
}
}
class Main{
    public static void main(String[] args) {
        
        SavingsAccount sa=new SavingsAccount(12345l,12000);
        sa.withdraw(5000);
        sa.deposit(4000);
        sa.checkLoanEligibility();

        CurrentAccount ca= new CurrentAccount(67890l,12000);
        ca.deposit(5000);
        ca.withdraw(4000);
    }

}