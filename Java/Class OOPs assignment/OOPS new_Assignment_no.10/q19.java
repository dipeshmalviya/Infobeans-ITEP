/*19) Make list of Students having name, roll no., age, 
score. Write a program to accept 10 students record and arrange
 the Students based on the score group [0-50], [50-65],[65-80],[80-100].
 */

  import java.util.Scanner;
class Student{
    private String name;
    private int rollno;
    private int age;
    private int score;
    public Student(){}
    public Student(String name,int rollno,int age, int score){
    this.name=name;
    this.rollno=rollno;
    this.age=age;
    this.score=score;    
    }
    public int getScore(){
        return score;
    }
    public String toString(){
    return("Name :   "  +name+  " Roll no :  "  +rollno+  " Age :  "  +age+  "Score :  "  +score);
    }

}

class TestMain{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

     Student students[]=new Student[10];
      for(int i=0;i<students.length;i++){
      System.out.println("enter name : rollno : age : score  : "+(i+1)+ " student");
      String name=sc.nextLine();
      int rollno=sc.nextInt();
      int age=sc.nextInt();
      int score=sc.nextInt();
         
      students[i]=new Student(name,rollno,age,score);
      }
      Student group []=new Student[students.length];
       // groups 4
       for(int i=0;i<group.length;i++){
        if(students[i].getScore()>=0 && (students[i].getScore()<50)){
            group[i]=students[i];
        }
        // groups 3
        else if(students[i].getScore()>=50 && (students[i].getScore()<65)){
            group[i]=students[i];
        }
       // group 2
       else if(students[i].getScore()>=65 && (students[i].getScore()<80)){
            group[i]=students[i];
        }
        //group 1
        else //(students[i].getScore()>=80 && (students[i].getScore()<=100)){
            group[i]=students[i];
        }

        //printing students with group wise
        for(Student element:group){
            System.out.println(element);
        }
       }
    }


/*class Student{
    private String name;
    private int roll_no;
    private int age;
    private int score;
    Student(){}
    Student(String name,int roll_no,int age,int score){
        this.name=name;
        this.roll_no=roll_no;
        this.age=age;
        this.score=score;
    }
    public int getScore(){
        return score;
    }

}

class Group{
     
       Group(){}
       Group(){

       }
}

class TestMain{
    public static void main(String[] args) {
        Student students[]=new Student[10];
      for(int i=0;i<10;i++){
      System.out.println("enter name : rollno : age : score  : "+(i+1)+ "student");
      String name=sc.next();
      int rollno=sc.nextInt();
      int age=sc.nextInt();
      int score=sc.nextInt();
         
      students[i]=new Student(name,rollno,age,score);
      }

        Group g1=new Group();
       
    }
}*/