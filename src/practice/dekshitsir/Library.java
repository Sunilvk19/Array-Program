package practice.dekshitsir;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

   public void addBook(Book book){
       books.add(book);
       System.out.println("Book Added Successfully");
   }
   public void viewAllBook(){
       if(books.isEmpty()){
           System.out.println("Book is not found");
       }
       for(Book book : books){
           System.out.println(book);
       }
   }
   public void searchBook(String keyword){
       boolean found = false;
       for(Book book : books){
           if(book.getTitle().equalsIgnoreCase(keyword)||book.getAuthor().equalsIgnoreCase(keyword)){
               System.out.println(book);
               found = true;
           }
       }
       if(!found)
           System.out.println("No Book found with keyword"+keyword);
   }
   public void borrowBook(String ISBN){
       for(Book book : books){
           if (book.getISBN().equals(ISBN)){
               book.borrowBook();
               return;
           }
       }
       System.out.println("Book is not found");
   }

   public void returnBook(String ISBN){
       for(Book book : books){
           if(book.getISBN().equals(ISBN)){
               book.returnBook();
               return;
           }
       }
       System.out.println("Book is not found");
   }
}
