package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title = "";
    private String author = "";
    private String isbn = "";
    private int yearPublished = 0;
    private int quantity = 0;
    
    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.

    public Book (String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }
    public String getTitle() { //returns the title of the book
        return title;
    }

    public void setTitle(String title) { //changes the title of the book to something else
        this.title = title;
    }

    public String getAuthor() { //returns the author of the book
        return author;
    }

    public void setAuthor(String author) { //changes the author of the book to someone else
        this.author = author;
    }

    public int getYearPublished() { //returns the year the book was published
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) { //changes when the book was published to another year
        this.yearPublished = yearPublished;
    }

    public String getIsbn() { //returns the ibsn of the book
        return isbn;
    }

    public void setIsbn(String isbn) { //changes the isbn of the book to something else
        this.isbn = isbn;
    }

    public int getQuantity() { //returns how many books are in the Bookstore
        return quantity;
    }

    public void setQuantity(int quantity) { //changes the quantity of how many books are in the Bookstore
        this.quantity = quantity;
    }

    public String bookInfo(){
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    } //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
       
}