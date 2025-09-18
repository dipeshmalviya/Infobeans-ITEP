/* 14. Write a Java program to create a class called
 "School" with attributes for students, teachers, and classes,
  and methods to add and remove students and teachers, and to
   create classes.
 */
import java.util.ArrayList;
class School{
    private ArrayList<String> students = new ArrayList<String>();
     private ArrayList<String> teachers = new ArrayList<String>();
     private ArrayList<String> classes = new ArrayList<String>();
    public void addStudent(String s1){
        System.out.println("student added : "+s1);
       students.add(s1);
    }
    public void removeStudent(String s1){
        System.out.println("student removed : "+s1);
        students.remove(s1);
    }
    public void addTeacher(String t1){
    System.out.println("teacher added : "+t1);
       teachers.add(t1);
    }
    public void removeTeacher(String t1){
        System.out.println("teacher removed : "+t1);
        teachers.remove(t1);
    }
  public void createClass(String c1){
         System.out.println("class added : "+c1);   
         classes.add(c1);
  }
   public void removeClass(String c1){
         System.out.println("class removed : "+c1);   
         classes.remove(c1);
  }
  public void displayStudents(){
  for(String s : students){
      System.out.println("students are : "+s);   
  }
}
    public void displayTeachers(){
  for(String t : teachers){
      System.out.println("teachers are : "+t);   
  }
}
    public void displayClasses(){
  for(String c : classes){
      System.out.println("classes are : "+c);   
  }
  }

}

class TestMain{
    public static void main(String args[]){
       

        School grace = new School(); // grace
        grace.addStudent("ritik");
        grace.addStudent("dipesh");
        grace.addStudent("krishna");
        grace.removeStudent("ritik");

         grace.addTeacher("ritik");
        grace.addTeacher("dipesh");
        grace.addTeacher("krishna");
        grace.removeTeacher("ritik");
        //creating classes
        grace.createClass("maths");
        grace.createClass("english");
        grace.createClass("hindi");
        grace.createClass("softskill");
        grace.removeClass("hindi");
        grace.removeClass("softskill");
           grace.createClass("java");
        System.out.println("----------------------------------------------------");
        grace.displayStudents();
        grace.displayTeachers();
        grace.displayClasses();

    }
}