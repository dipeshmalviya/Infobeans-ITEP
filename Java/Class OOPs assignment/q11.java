/* 11. Write a Java program to create a class called
 "Library" with a collection of books and methods to
  add and remove books.
 */

 import java.util.ArrayList;
class Library{
    private ArrayList<String> book = new ArrayList<String>();
    
    public void addBook(String a){
         System.out.println("add book in library : "+a);
       book.add(a);
    }
    public void removeBook(String b){
        System.out.println("remove book in library : "+b);
        book.remove(b);
    }
    
   
   

}

class TestMain{
    public static void main(String args[]){

        Library oxford = new Library(); // oxford
        oxford.addBook("Vedant");
        oxford.addBook("Gita");
        oxford.addBook("Udaan");
        
        
        oxford.removeBook("Vedant");
        System.out.println("----------------------------------------------------");
        
       

    }
}