package com.mycompany.library_system;

import java.util.Scanner;

public class Library_System {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Library System!");
            System.out.println("1. Add a book");
            System.out.println("2. Search for a book");
            System.out.println("3. Delete a book");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left in the buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter the title to search for: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                    break;

                case 3:
                    System.out.print("Enter the ISBN of the book to delete: ");
                    String deleteIsbn = scanner.nextLine();
                    library.deleteBook(deleteIsbn);
                    break;

                case 4:
                    library.displayBook();
                    break;

                case 5:
                    System.out.println("Exiting Library System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
}
