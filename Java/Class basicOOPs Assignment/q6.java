/*  Movie Rating System
Create a class Movie with fields: name, genre, and rating.
Use setters and create a method isHit() that returns true if rating ≥ 8.0.  */
import java.util.Scanner;
class Movie{
private String name;
private String genre;
private float rating;

public void setName(String name){
   this.name=name;
}
public void setGenre(String genre){
   this.genre=genre;
}

public void setRating(float rating){
   this.rating=rating;
}

public boolean isHit(float rating){
   if(rating>=8.0)
    return true;
return false;
}

}

class RatingSystem{
public static void main(String []args){
Scanner sc=new Scanner(System.in);


System.out.println("Enter movie name : ");
String name=sc.nextLine();
//sc.nextLine();
System.out.println("Enter movie genre : ");
String genre=sc.nextLine();
System.out.println("Enter movie rating : ");
float rating=sc.nextFloat();

Movie m1=new Movie();

m1.setName(name);
m1.setGenre(genre);
m1.setRating(rating);
//m1.Display();
boolean status =m1.isHit(rating);
if(status)
System.out.println("Super Hit");
else
System.out.println("flop ");





}
}