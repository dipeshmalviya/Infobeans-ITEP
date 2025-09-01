/*
 * Problem 3: Online Learning Platform 🎓
 * Abstract class Course:
 * title, duration fields
 * abstract method startCourse(), endCourse()
 * concrete method courseDetails()
 * Subclasses:
 * VideoCourse
 * LiveCourse
 * Interface CertificateProvider with generateCertificate() method.
 * Only VideoCourse provides certificates.
 * In main method, simulate starting, ending, and generating certificates.
 * ------------------------------------------------------------------------------------------------------------
 */
abstract class Course{
    private String title;
    private String duration;
    Course(){};
    public Course(String title,String duration){
        this.title=title;
        this.duration=duration;
    }
    abstract void startCourse();
    abstract void endCourse();
    void courseDetails(){
        System.out.println("title : "+title +" duration :"+duration );
    }

}
interface CertificateProvider {
 public void generateCertificate();
    
}
class VideoCourse extends Course implements CertificateProvider{
      VideoCourse(){};
      public VideoCourse(String title,String duration){
         super(title,duration);
      }

      void startCourse(){
        System.out.println("Start video course");
      }
      void endCourse(){
          System.out.println("end video course");
      }
      public void generateCertificate(){
          System.out.println("Your Certificate is Successfully Generated");
      }
}
class LiveCourse extends Course{
    LiveCourse(){};
    public LiveCourse(String title,String duration){
         super(title,duration);
      }
    void startCourse() {
        System.out.println("Start Live course");
    }

    void endCourse() {
        System.out.println("end Live course");
    }
}
class Main{
    public static void main(String[] args) {
        
        VideoCourse v1 = new VideoCourse("C++", "59 MINUTES");
        v1.courseDetails();
        v1.startCourse();
        v1.endCourse();
        v1.generateCertificate();
      

        LiveCourse l1=new LiveCourse("JAVA","30 MINUTES");
        l1.courseDetails();
        l1.startCourse();
        l1.endCourse();
        

        

    }
}