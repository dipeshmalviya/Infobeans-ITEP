/*
 * 5. OOPs Problem
 * 
 * Library Management (Inheritance + Polymorphism)
 * 
 * Create an abstract class LibraryItem with fields: title, id.
 * 
 * Add an abstract method calculateLateFee(int daysLate).
 * 
 * Create two subclasses:
 * 
 * Book: Late fee = ₹2 per day.
 * 
 * DVD: Late fee = ₹5 per day.
 * 
 * In main, create a list of LibraryItem references (both Book and DVD objects),
 * loop through them, and print late fees using polymorphism.
 */

import java.util.ArrayList;

abstract class LibraryItem{
     private String title;
     private int  id;
      LibraryItem(String title,int id){
        this.title=title;
        this.id=id;
      }
     abstract void calculateLateFee(int daysLate);
    
}
class Book extends LibraryItem{
    Book(String title, int id){
         super(title, id);
    }
    public void calculateLateFee(int daysLate){
         System.out.println("Late fees of book: "+daysLate*2);
        
    }
}
class DVD extends LibraryItem{
    DVD(String title, int id){
         super(title, id);
    }
    public void calculateLateFee(int daysLate) {
         System.out.println("Late fees of DVD: " + daysLate * 5);
    }
}
class Test{
    public static void main(String[] args) {

        ArrayList<LibraryItem>li = new ArrayList<>() ;
        
        LibraryItem l1=new Book("ABC",1);
        LibraryItem l2=new DVD("DEF",2);

        l1.calculateLateFee(5);
        l2.calculateLateFee(44);
    }
}