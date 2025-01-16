package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name = "";
    private String Id = "";
    private Book [] books = new Book [5];
    
    //requires 1 contructor with two parameters that will initialize the name and id
    public User (String name, String Id) {
        this.name = name;
        this.Id = Id;
    }
    public String getName() { //returns the name of the user
        return name;
    }

    public void setName(String name) {//changes the name of the user
        this.name = name;
    }

    public String getId() {//returns the Id of the user
        return Id;
    }

    public void setId(String Id) {//changes the Id of the user
        this.Id = Id;
    }

    public Book [] getBooks() {//returns the books that are borrowed the user
        return books;
    }

    public void setBooks(Book[] books) {//changes the books that are borrowed the user
        this.books = books;
    }

    public String bookListInfo(){
        String listInfo = "";
        for (Book b : books) {
            if (b != null) {
                listInfo += b.bookInfo();
            } else {
                listInfo += "empty";
            }
            listInfo += "\n";
        }
        return listInfo;
    } //returns a booklist for the user, if empty, output "empty"

    public String userInfo(){
        String info = "Name: " + name + "\nId: " + Id + "\nBooks: ";
        info += "\n" + bookListInfo();
        return info;
        
    } //returns  "Name: []\nID: []\nBooks:\n[]"
       
}