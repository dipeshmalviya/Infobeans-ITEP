/*
 * Problem 5: Smart Home System 
 * Abstract class Appliance:
 * name, power
 * abstract methods turnOn(), turnOff()
 * concrete method showStatus()
 * Subclasses:
 * Fan
 * Light
 * WashingMachine
 * Interface SmartDevice with method connectWifi().
 * Only Light and WashingMachine are smart devices.
 * In main method, turn on/off appliances and connect smart ones to WiFi.
 * ---------------------------------------------------------------------------------------------------
 */
abstract class Appliance{
    private String name;
    private boolean power;
    Appliance(){};
    Appliance(String name,boolean power){
        this.name=name;
        this.power=power;
    };
    public String getName() {
        return name;
    }
    public boolean getPower(){
        return power;
    }
    abstract public void turnOn(boolean power);
    abstract public void turnOff(boolean power);

    

    public  void showStatus(){
        if(getPower())
       System.out.println(name+" is : "+ "on");
       else
       System.out.println(name + " is : " + "off");
    }

}
interface SmartDevice {
   void  connectWifi();

}
class Fan extends Appliance{
    Fan(){};
    Fan(String name,boolean power){
        super(name,power);
    }
    public void turnOn(boolean power){
        System.out.println("Fan is on");
    }
    public void turnOff(boolean power){
        System.out.println("Fan is off");
    }
}

class Light extends Appliance implements SmartDevice {
            Light(){};

            Light(String name,boolean power){
            super(name,power);
          }

    public void turnOn(boolean power) {
        System.out.println("Light is on");
    }

    public void turnOff(boolean power) {
        System.out.println("Light is off");
    }
    public void connectWifi(){
        System.out.println("Light is connect to wifi");
    }
}

class WashingMachine extends Appliance implements SmartDevice{
        WashingMachine(){};

        WashingMachine(String name,boolean power){
            super(name,power);
          }

    public void turnOn(boolean power) {
        System.out.println("WashingMachine is on");
    }

    public void turnOff(boolean power) {
        System.out.println("WashingMachine is off");
    }

    public void connectWifi() {
        System.out.println("WashingMachine is connect to wifi");
    }
}
class Main{
    public static void main(String[] args) {
        
        Fan f= new Fan("Crompton",false);
        f.turnOn(true);
        f.turnOff(false);
        f.showStatus();

        Light l= new Light("Ujala",false);
        l.turnOn(true);
        l.turnOff(true);
        l.connectWifi();
        l.showStatus();

        WashingMachine w= new WashingMachine("samsung",false);
        w.turnOn(true);
        w.turnOff(false);
        w.connectWifi();
        w.showStatus();
    }
}