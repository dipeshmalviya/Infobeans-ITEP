/*16) Create a class Person with properties (name and age) with following features.
Default age of person should be 18.
A person object can be initialized with name and age.
Method to display name and age of person.
*/
class Person{
    private String name;
    private int age = 18;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void display(){
        System.out.println(name + " is " + age + " years old.");
    }

}

class Test{
    public static void main(String args[]){
        Person p1 = new Person("ritik", 17);
        Person p2 = new Person("sumit");
        p1.display();
        p2.display();
    }
}