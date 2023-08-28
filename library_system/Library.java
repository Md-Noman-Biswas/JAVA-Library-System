package com.mycompany.library_system;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    
    public Library(){
        books = new ArrayList<>();
    }
    
    public void addBook(Book book){
        books.add(book);
        System.out.println("Books added successfully");
    }
    
    public void deleteBook(String isbn){
        for(Book book: books){
            if(book.getIsbn().equals(isbn)){
                books.remove(book);
                System.err.println("Book deleted successfully");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found!");
    }
    
    public void searchBook(String title){
        for(Book book: books){
            if(book.getTitle().equals(title)){
                System.out.println("Book found\n");
                return;
            }
        }
        System.out.println("Book with title " + title + " not found!");
    }
    
    public void displayBook(){
        if(books.isEmpty()){
            System.out.println("No books in the library");
            return;
        }
        System.err.println("List of books in the library: ");
        for(Book book: books){
            System.err.println(book);
        }
    }
    
}
