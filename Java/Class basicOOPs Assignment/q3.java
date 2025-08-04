/*  Bank Account
Create a class BankAccount with fields: accountNumber, holderName, balance.
Use setters to assign values. Add a method to display balance.
 */
import java.util.Scanner;
class Account{
private long accountNumber;
private String holderName;
private float balance;

public void setAccountNumber(long accountNumber){
   this.accountNumber=accountNumber;
}
public void setHolderName(String holderName){
   this.holderName=holderName;
}

public void setBalance(float balance){
   this.balance=balance;
}

public void Display(){
 System.out.println("accountNumber = " +accountNumber +"\nholderName= " +holderName +"\nbalance= $" +balance);
}
}

class Bank{
public static void main(String []args){
Scanner sc=new Scanner(System.in);


System.out.println("Enter accountNumber  : ");
long accountNumber=sc.nextLong();
sc.nextLine();
System.out.println("Enter holderName : ");
String holderName=sc.nextLine();
System.out.println("Enter balance : ");
float balance=sc.nextFloat();

Account a1=new Account();

a1.setAccountNumber(accountNumber);
a1.setHolderName(holderName);
a1.setBalance(balance);
a1.Display();


}
}