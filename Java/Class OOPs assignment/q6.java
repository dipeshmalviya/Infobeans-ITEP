/* 6. Write a Java program to create a class called "Employee"
 with a name, job title, and salary attributes, and methods to 
 calculate and update salary.
 */

class Employee{
    private String name;
    private String jobtitle;
    private int salary;
    public Employee(String name,String jobtitle, int salary){
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }
    
     public void displaySalary(){
        System.out.println("Current salary : "+this.salary);
    }
    public Employee(){}
    public void displayUpdatedSalary(int update){
                salary = salary+update;
        System.out.println("Updated salary : "+this.salary);
    }
    public void displayEmployeeDetails(){
        System.out.println("name : "+name +"\njobtitle : "+jobtitle +"\nsalary : "+salary);
    }

}
class TestMain{
    public static void main(String args[]){
        Employee obj1 = new Employee("Dharmen","Driver",20000);
        Employee obj2 = new Employee("sumer","fighter",19000);
        Employee obj3 = new Employee("pradeep","helper",14000);
        
         obj1.displayEmployeeDetails();
        obj1.displaySalary();
        obj1.displayUpdatedSalary(5000);
        System.out.println("----------------------------------------------------");
       
        
       

    }
}