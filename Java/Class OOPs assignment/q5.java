/* 5. Write a Java program to create a class called
 "Book" with attributes for title, author, and ISBN( International Standard 
 Book Number), and methods to add and remove books from a collection.
 */

import java.util.ArrayList;
class Library{
    private ArrayList<Book> al = new ArrayList<Book>();
    
    public void addBook(Book book){
       al.add(book);
    }
    public void removeBook(Book book){
        al.remove(book);
    }
    public void displayBookDetails(){
        for(Book book : al){
            System.out.println(book.getFullBookDetails());
        }
    }
   
   

}
class Book{
    private String title;
    private String author;
    private String ISBN;
    public Book(String title,String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
     public void bookEnquiry(){
        System.out.println("Current Book : "+this.title);
    }
    public Book(){}
    public String getFullBookDetails(){
        return title+" : "+author+" : "+ISBN;
    }
}
class TestMain{
    public static void main(String args[]){
        Book obj1 = new Book("Vedant","Aachrya prashant","5000-0123-4567");
        Book obj2 = new Book("Gita","Aachrya prashant","1000-0011-2233");
        Book obj3 = new Book("Udaan","Aachrya prashant","7000-0123-9786");

        Library oxford = new Library(); // oxford
        oxford.addBook(obj1);
        oxford.addBook(obj2);
        oxford.addBook(obj3);
        
        oxford.displayBookDetails();
        oxford.removeBook(obj1);
        System.out.println("----------------------------------------------------");
        oxford.displayBookDetails();
        
       

    }
}