/* 1. Constructor Problem

Car Inventory System

Create a class Car with fields: brand, model, price.

Implement:

A default constructor (sets "Unknown" values and price = 0).

A parameterized constructor to initialize all fields.

A copy constructor to clone another Car.

Write a test class to create cars using all three constructors and print their details. */
class Car{
    private String brand;
    private String model;
    private int price;

    //constructor
    Car(){
        brand="Unknown";
        model="Unknown";
        price=0;

    }
    Car(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;

    }
    Car(Car c){
           brand=c.brand;
           model=c.model;
           price=c.price;

    }
    public  void display(){
        System.out.println("Car Brand: "+brand +"Car Model: " +model +"Car price: " +price);
    }

}
class Test{
    public static void main(String[] args) {
        
        Car c1=new Car();
        c1.display();
        Car c2=new Car("TATA","nexon",200000);
        c2.display();
        Car c3=new Car(c2);
        c3.display();
    }
}