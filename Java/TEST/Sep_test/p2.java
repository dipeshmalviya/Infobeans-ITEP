/*
 * 2. Exception Handling Problem
 * 
 * Bank Withdrawal Simulation
 * 
 * Create a custom exception InsufficientFundsException.
 * 
 * Create a class BankAccount with fields: accountNumber, balance.
 * 
 * Add a withdraw(double amount) method that:
 * 
 * Throws InsufficientFundsException if the amount > balance.
 * 
 * Deducts the amount otherwise.
 */
class InsufficientFundsException extends Exception{
     InsufficientFundsException(String msg){
        super(msg);
     }
     
}
class BankAccount{
    private int accountNumber;
   private double balance;

  // BankAccount(){};
   BankAccount (int accountNumber,double balance){
    this.accountNumber=accountNumber;
    this.balance=balance;
   }

   public void withdrawal(double amount){
    try{
      if(amount>balance){
        throw new InsufficientFundsException("Insfficient balance");
      }
   }
   catch( InsufficientFundsException e){
        e.printStackTrace();
        
   }
   if(balance>=amount){
    balance=balance-amount;
    System.out.println("amount deduct");
   }
  
       
   
}
}
class Test{
    public static void main(String[] args) {
        
        BankAccount b1=new BankAccount(1112344,22000);
        b1.withdrawal(220000);
    }
}