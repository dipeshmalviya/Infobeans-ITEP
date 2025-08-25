/*Write a Java program using OOP concepts:
Create a class Student with attributes: name, marks.
Create a method getGrade() that returns:
"A" if marks ≥ 80
"B" if marks ≥ 60 and < 80
"C" if marks ≥ 40 and < 60
"F" if marks < 40
Create main() method to create 3 students and print their name with grade.
 */
import java.util.Scanner;
class Student{
    private String name;
    private int marks;
    Student(){};
    Student(String name){
        this.name=name;
       
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
     
    public String  getGrade(){
        if(marks<0){
           System.out.println("please enter valid marks");
           return "Z";
        }
        else
       if(marks>=80){
        return "A";
       }
       else if (marks>=60 && marks<80) {
         return "B";
       }
       else if(marks>=40 && marks<60){
         return "C";
       }
       else
        return "F";

    }

}
class TestMain{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s1= new Student("ram");
        Student s2= new Student("shyam");
         Student s3= new Student("ram");
      
        s1.setMarks(70);
        s2.setMarks(40);
         s3.setMarks(100);

         String st1=s1.getGrade();
         String st2=s2.getGrade();
         String st3=s3.getGrade();


         System.out.println("Grade of student 1 :"+st1);
         System.out.println("Grade of student 2 :"+st2);
         System.out.println("Grade of student 3 :"+st3);
    }
}