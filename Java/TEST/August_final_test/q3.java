/* Design a simple Library Management System using classes with the following:
A Book class with fields: id, title, author.
A Library class with methods:
addBook(Book b)
listBooks()
deleteBook(int id)
Write a program to:
Add 3 books.
List all books.
Delete a book by id and display remaining books. */
import java.util.ArrayList;
 class Library {
  public ArrayList<Book>al =new ArrayList<Book>();
  public void addBook(Book b){
    System.out.println("book added successfully");
      al.add(b);
  }
  public void deleteBook(int id ){
   
    for(int i=0;i<al.size();i++){
      if(al.get(i).getId()==id){
        al.remove(i);
        System.out.print("\nbook deleted successfully ");
      }
    }
         
  }
  
  public void listBooks(){
  for(Book b:al){
   System.out.print(b.bookdetails() +"  ");
  }
 
}  
  public void displayBooks(){
  System.out.print("Books in the library:");
  for(Book b:al){
   System.out.print(b.bookdetails() +"  ");
  }

  
}  
 }
class Book{
    private int id;
     private String title;
      private String author;
      public Book(){}
      public Book(int id,String title,String author){
       this.id = id;
       this.title = title;
        this.author = author;
      }
    
      public void setId(int id) {
          this.id = id;
      }
       public void setTitle(String title) {
          this.title = title;
      }
       public void setAuthor(String author) {
          this.author = author;
      }
      
     public int getId(){
        return id;
     }
     public String bookdetails(){
     // return "Book ID: " + id + ", Title: " + title + ", Author: " + author;
     return title;
     }

}

public class q3 {
    public static void main(String[] args) {
        
        Book b1=new Book(1,"Ramayana","Walmiki");
        Book b2=new Book(2,"Mahabharat","Veda Vyasa");
        Book b3=new Book(3,"Vedant","Prashant");
          
        Library l1=new Library();
        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);
        l1.listBooks();
        
       l1.displayBooks();

        l1.deleteBook(1);
        l1.deleteBook(2);
        l1.displayBooks();
       

    }
}
 