/*
 * 🔹 Problem Set on Abstract Class, Inheritance & Interface
 * Problem 1: Payment Gateway System 💳
 * Create an abstract class Payment with:
 * amount field
 * abstract method pay()
 * concrete method paymentDetails()
 * Subclasses:
 * CreditCardPayment
 * DebitCardPayment
 * UPIPayment
 * Create an interface Refundable with processRefund() method.
 * Only CreditCardPayment and UPIPayment should implement Refundable.
 * In main class, create different payments and process refund where applicable.
 * -----------------------------------------------------------------------------
 * ----------------------------
 */
abstract class Payment{
    private double amount;
        Payment(){};

    abstract public void pay();
    public void paymentDetails(){
        System.out.println(amount);
    }


}

interface Refundable {
    public void processRefund();

}
class CreditCardPayment extends Payment implements Refundable {
    CreditCardPayment(){};
    public void pay(){
        System.out.println("Pay by Credit card");
   }
   public void processRefund(){
       System.out.println("Refund to credit card applicable");
   }

}

class DebitCardPayment extends Payment {
    DebitCardPayment() {};

    public void pay(){
        System.out.println("Pay by Debit card");
   }
   
}

class UPIPayment extends Payment implements Refundable{
    UPIPayment() {};

    public void pay(){
        System.out.println("Pay by UPI");
   }
   
   public void processRefund() {
       System.out.println("Refund to UPI applicable");
   }

}
class Main{
    public static void main(String[] args) {
        
        CreditCardPayment visa=new CreditCardPayment();
        visa.pay();
        visa.processRefund();

        DebitCardPayment RuPay=new DebitCardPayment();
        RuPay.pay();
        //RuPay.processRefund();

        UPIPayment Paytm = new UPIPayment();
        Paytm.pay();
        Paytm.processRefund();
    }
}
