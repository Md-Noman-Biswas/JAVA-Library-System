package com.mycompany.library_system;


public class Library_System {

    public static void main(String[] args) {
        Library library = new Library();
        
        Book book1 = new Book("Algorithms", "LUV", "12345");
        Book book2 = new Book("CS50x", "David J Malan", "5050");
        Book book3 = new Book("Habits", "Mr x", "23232");
        
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        library.searchBook("CS50x");
        
        library.deleteBook("23232");
        
        library.displayBook();
        
    }
}
