package com.bookassignment;

import java.util.*;

enum Category {
    FICTION,
    NON_FICTION,
    THRILLER,
    MYSTERY,
    SCIENCE_FICTION,
    ROMANCE,
    BIOGRAPHY
}

class Book {
    private String isbn;
    private Category category;
    private double price;
    private String authorName;
    private int quantity;

    public Book(String isbn, Category category, double price, String authorName, int quantity) {
        this.isbn = isbn;
        this.category = category;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", authorName='" + authorName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

public class Library {
    private HashSet<Book> books;

    public Library() {
        books = new HashSet<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayBooksByCategory() {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(Comparator.comparing(Book::getCategory));
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }

    public void displayBooksByAuthor() {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(Comparator.comparing(Book::getAuthorName));
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }

    public Book findBookById(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
    
        return null;
    }
}
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add book");
            System.out.println("2. Display all books");
            System.out.println("3. Sort books by category");
            System.out.println("4. Sort books by author");
            System.out.println("5. Find book by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    break;
            }
    
            
