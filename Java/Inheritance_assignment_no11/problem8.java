/*
 * Problem 7: E-commerce Order System 
 * Abstract class Order:
 * orderId, amount
 * abstract methods processOrder(), cancelOrder()
 * concrete method orderSummary()
 * Subclasses:
 * OnlineOrder
 * StorePickupOrder
 * Interface DiscountApplicable with applyDiscount() method.
 * Only OnlineOrder gets discount.
 */
interface DiscountApplicable {
    void applyDiscount();

}
abstract class Order {
    private String orderId;
    private double amount;

    Order() {
    };

    Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    };

    abstract public void processOrder();

    abstract public void cancelOrder();

    public void orderSummary() {
        System.out.println("Order id is : " + orderId + " and amount is : " + amount);
    }
}

class OnlineOrder extends Order {
    OnlineOrder() {
    };

    OnlineOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    public void processOrder() {
        System.out.println("order is processing");
    }

    public void cancelOrder() {
        System.out.println("order is cancelled");
    }
}


class StorePickupOrder extends Order implements DiscountApplicable {
    StorePickupOrder() {
    };

    StorePickupOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    public void processOrder() {
        System.out.println("order is processing");
    }

    public void cancelOrder() {
        System.out.println("order is cancelled");
    }

    public void applyDiscount() {
        System.out.println("Discount is applicable");
    }
}

class Main {
    public static void main(String[] args) {
     
        OnlineOrder o1=new OnlineOrder("k13ed",1000);
       o1.processOrder();
       o1.cancelOrder();
       o1.orderSummary();

       StorePickupOrder spo1=new StorePickupOrder("zsdjn456",799);
       spo1.processOrder();
       spo1.cancelOrder();
       spo1.applyDiscount();
       spo1.orderSummary();
    }
}