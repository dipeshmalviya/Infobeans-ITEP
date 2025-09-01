/*
 * Problem Statement 🚗
 * You are building a transportation system for a logistics company.
 * Requirements:
 * Every Vehicle should have:
 * a registration number,
 * a method to start,
 * a method to stop.
 * Some vehicles run on Fuel (like Car, Truck), while others run on Electricity
 * (like ElectricBike, ElectricCar).
 * Create an interface Chargeable that forces all electric vehicles to
 * implement:
 * chargeBattery() method.
 * Create an abstract class Vehicle that:
 * Stores the registration number.
 * Has abstract methods start() and stop().
 * Has a concrete method displayInfo() to show vehicle details.
 * Create subclasses:
 * Car (inherits from Vehicle) → Fuel based.
 * Truck (inherits from Vehicle) → Fuel based.
 * ElectricBike (inherits from Vehicle and implements Chargeable).
 * ElectricCar (inherits from Vehicle and implements Chargeable).
 * In the main class (TransportSystem),
 * Create objects of all types of vehicles.
 * Call their methods (start, stop, chargeBattery where required).
 * Expected Output Example
 * Car KA01AB1234 starting with petrol engine...
 * Car KA01AB1234 stopped.
 * Truck KA02XY9876 starting with diesel engine...
 * Truck KA02XY9876 stopped.
 * Electric Bike KA03EL5678 starting silently...
 * Electric Bike KA03EL5678 battery charging...
 * Electric Bike KA03EL5678 stopped.
 * Electric Car KA04EV4321 starting silently...
 * Electric Car KA04EV4321 battery charging...
 * Electric Car KA04EV4321 stopped.
 * ------------------------------------------------------------------------------------------------------------------------------
 */
abstract class Vehicle{
   private String reg_no;
    Vehicle(){};
    Vehicle(String r){
        this.reg_no=r;
    }
   abstract public void start();
   abstract public void stop();
   public void displayInfo(){
    System.out.print(this.getClass().getSimpleName() +" " +reg_no +" ");
   }

}
class Car extends Vehicle{
       Car(){};
       Car(String r){
        super(r);
       }
     public void start(){
        System.out.println("starting with petrol engine...");
     }
     public void stop(){
         System.out.println(" stopped.");
     }
     public void fuel(){
         System.out.println("Fuel based");
     }
}

class Truck extends Vehicle {
    Truck(){}
        Truck(String r){
        super(r);
       }
    public void start() {
        System.out.println("starting with diesel engine...");
    }

    public void stop() {
        System.out.println("stopped");
    }

    public void fuel() {
        System.out.println("Fuel based");
    }
}

interface Chargeable {
    public void chargeBattery();

}
class ElectricBike extends Vehicle implements Chargeable{
    ElectricBike(){};
    ElectricBike(String r){
        super(r);
       }
    public void start() {
        System.out.println("starting silently...");
    }

    public void stop() {
        System.out.println("stopped.");
    }
    public void chargeBattery(){
        System.out.println(" battery charging...");
    }
}

class ElectricCar extends Vehicle implements Chargeable {
    ElectricCar(){};
   ElectricCar(String r){
        super(r);
       }
    
       public void start() {
           System.out.println("starting silently...");
       }

       public void stop() {
           System.out.println("stopped.");
       }

       public void chargeBattery() {
           System.out.println(" battery charging...");
       }
}

class TransportSystem{
    public static void main(String[] args) {
        
        Car nexon=new Car("KA01AB1234");
        nexon.displayInfo();
        nexon.start();
        nexon.displayInfo();
        nexon.stop();
       
      

        Truck ace = new Truck("KA02XY9876");
        ace.displayInfo();
        ace.start();
        ace.displayInfo();
        ace.stop();
        
        

        ElectricBike OLA_super = new ElectricBike("KA03EL5678");
        OLA_super.displayInfo();
        OLA_super.start();
        OLA_super.displayInfo();
        OLA_super.chargeBattery();
        OLA_super.displayInfo();
        OLA_super.stop();
        
      

        ElectricCar tiago = new ElectricCar("KA04EV4321");
        tiago.displayInfo();
        tiago.start();
        tiago.displayInfo();
        tiago.chargeBattery();
        tiago.displayInfo();
        tiago.stop();
        
      
    }
}
