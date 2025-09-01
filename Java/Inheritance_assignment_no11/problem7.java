/*
 * Problem 6: Zoo Animal Management 
 * Abstract class Animal:
 * name, age
 * abstract methods eat(), makeSound()
 * concrete method showInfo()
 * Subclasses:
 * Lion
 * Elephant
 * Parrot
 * Interface Flyable with fly() method.
 * Only Parrot implements Flyable.
 * --------------------------------------------------------------------------------------------
 */
interface Flyable {
 void fly();
    
}
abstract class Animal{
    private String name;
    private int age;
    Animal(){};
    Animal (String name,int age){
        this.name=name;
        this.age=age;
    };
    abstract public void eat();
    abstract public void makeSound();

    public void showInfo(){
        System.out.println("name of animal is : "+name +" and age is : "+age);
    }
} 
class Lion extends Animal{
    Lion(){};
    Lion(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("Lion eat's meat");
    }
    public void makeSound(){
        System.out.println("lions roar");
    }
}

class Elephant extends Animal {
    Elephant() {
    };

    Elephant(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("Elephant eat's  grass");
    }

    public void makeSound() {
        System.out.println("elephants growls, squeaks, and snort");
    }
}
class Parrot extends Animal implements Flyable{
    Parrot() {
    };

    Parrot(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("parrot eat's fruits, nuts, seeds, grains, vegetables, and sometimes insects");
    }

    public void makeSound() {
        System.out.println("parrot talking, squawking, screaming, whistling, and sometimes chirping or gurgling");
    }
    public void fly(){
        System.out.println("parrot is flying");
    }
}
class Main{
    public static void main(String[] args) {
        
        Lion l=new Lion("venkat",10);
        l.eat();
        l.makeSound();
        l.showInfo();

        Elephant e=new Elephant("minakshi",25);
        e.eat();
        e.makeSound();
        e.showInfo();

        Parrot p=new Parrot("raghav",3);
        p.eat();
        p.makeSound();
        p.fly();
        p.showInfo();
    }
}