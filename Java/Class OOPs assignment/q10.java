/* 10. Write a Java program to create a class called "Student" 
with a name, grade, and courses attributes, and methods to add 
and remove courses.
 */

import java.util.ArrayList;
import java.util.Scanner;
class Student{
    private String name;
    private String grade;
   private  ArrayList<String>courses=new ArrayList<String>();
    public Student(){}
    public Student(String name,String grade){
        this.name = name;
        this.grade = grade; 
    }
 
    public void addCourse(String course){
           System.out.println("course add : "+course);
          courses.add(course);
    }
    public void removeCourse(String course){
               System.out.println("course remove : "+course );
        courses.remove(course);
    }

    public void display(){
            System.out.println("name of a student is : "+name);
            System.out.println("grade of a student is : "+grade);
           System.out.println("courses are:");
            for(String element:courses){
                System.out.println(element);
            }
    }

    
}
class TestMain{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
            System.out.println("Enter the name of student");
        String name=sc.nextLine();
         System.out.println("Enter the grade of student");
        String grade=sc.nextLine();

        Student s1 = new Student(name,grade);
        
        s1.addCourse("java");
        s1.addCourse("C++");
        s1.addCourse("C");
        s1.addCourse("Fortran");
        s1.display();
        s1.removeCourse("java");
        s1.display();


        

       
        
       

    }
}