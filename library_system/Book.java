package com.mycompany.library_system;


public class Book {
    private String title;
    private String author;
    private String isbn;
    
    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    
    //getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    
    
    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    
    @Override
    public String toString(){
        return "Title: " + title + "\n" + "Author: " + author + "\n" + "ISBN: " + isbn + "\n";
    }
    
    
}
