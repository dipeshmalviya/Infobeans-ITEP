/* 17. Write a Java program to create a class called 
"Movie" with attributes for title, director, actors, 
and reviews, and methods for adding and retrieving reviews.
 */
import java.util.Scanner;
import java.util.ArrayList;

  class Movie{

        private String title;
        private String director;
        private String actor;
        private ArrayList<String>review = new ArrayList<String>();
         
       public Movie(){}
       public Movie(String title,String director,String actor){
                this.title=title;
                this.director=director;
                this.actor=actor;
       }
       public void addReviews(String r){
         System.out.println("new add review is: "+r);
        review.add(r);
       }
       public void removeReviews(String r){
         System.out.println("remove review is: "+r);
        review.remove(r);
       }
       public void retrievingReview(){
         System.out.println("Movies all reviews are : ->>>>>>>");
                for(String r: review)
                System.out.println(r);
        //System.out.println("retrievingreview : "+review.get(x));
                
       }

}
class TestMain{
        public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the title of movie : ");
                String title=sc.nextLine();
                System.out.println("Enter the name of director : ");
                String director=sc.nextLine();
                System.out.println("Enter the name of actor : ");
                String actor=sc.nextLine();

              Movie war2 = new Movie(title,director,actor);
              war2.addReviews("Superb");
              war2.addReviews("Nice!");
              war2.addReviews("best action movie");
              war2.addReviews("10 on 10");
              war2.addReviews("khas nhi thi");
              war2.addReviews("visual khrb h");
              war2.addReviews("best combat ever");
              war2.addReviews("Goosmpps");
              war2.addReviews("hritik and jr ntr fantastic action");
              war2.addReviews("paisa wasul");
              war2.addReviews("bad");
              war2.addReviews("spy series");


              war2.retrievingReview();
        }
}