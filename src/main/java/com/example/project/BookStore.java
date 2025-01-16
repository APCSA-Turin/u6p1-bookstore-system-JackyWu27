package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book [] books = new Book [5];
    private User[] users = new User[10];
    
    public BookStore () {}    

    public User[] getUsers(){
        return users;
    }

    public void setUsers(User[] users){
        this.users = users;
    }

    public Book[] getBooks(){
        return books;
    }

    public void addUser(User user){
        int found = 0;
        User [] temp = new User[users.length];
        for (int c = 0; c < users.length; c++) {
            if (found != 1 && users[c] == null) {
                temp[c] = user;
                found ++;
            } else {
                temp[c] = users[c];
            }
        }
        users = temp;
    } 

    public void removeUser(User user){
        int found = -1;
        for(int c = 0; c < users.length; c++){
            if (users[c] == user) {
                found = c;
            }
        }
        if (found != -1) {
            User [] temp = new User [users.length];
            for (int c = 0; c < users.length - 1; c ++) {
                if (c < found) {
                    temp[c] = users[c];
                }
                if (c >= found && c < users.length) {
                    temp[c] = users[c + 1];
                }  
            }
            users = temp;
        }

    }

    public void consolidateUsers(){
        User [] temp = new User [users.length];
        int count = 0;
        for (User espace : users) {
            if (espace != null) {
                temp[count] = espace;
                count ++;
            }
        }
        users = temp;
    }

    public void addBook(Book book){
        int found = 0;
        Book [] temp = new Book[books.length];
        for (int c = 0; c < books.length; c++) {
            if (found != 1 && books[c] == null) {
                temp[c] = book;
                found ++;
            } else {
                temp[c] = books[c];
            }
        }
        books = temp;
    }

    public void insertBook(Book book, int index){
        Book [] temp = new Book [books.length];
        for (int c = 0; c < books.length; c ++) {
            if (c < index) {
                temp[c] = books[c];
            }
            if (c == index) {
                temp[c] = book;
            }
            if (c > index && c != books.length) {
                temp[c] = books[c - 1];
            }
        }
        books = temp;
    }

    public void removeBook(Book book){
        int found = -1;
        for(int c = 0; c < books.length; c++){
            if (books[c] == book) {
                found = c;
                books[c].setQuantity(books[c].getQuantity() - 1);
            }
        }
        if (found != -1 && books[found].getQuantity() < 1 ) {
            Book [] temp = new Book [books.length - 1];
            for (int c = 0; c < books.length - 1; c ++) {
                if (c < found) {
                    temp[c] = books[c];
                }
                if (c >= found && c < books.length) {
                    temp[c] = books[c + 1];
                }  
            }
            books = temp;
        }
    }
       
    public String bookStoreBookInfo(){
        String temp = "";
        for (Book book : books) {
            temp = book.bookInfo();
        }
        return temp;
    } //you are not tested on this method but use it for debugging purposes

    public String bookStoreUserInfo(){
        String temp = "";
        for (User user : users) {
            temp = user.userInfo();
        }
        return temp;
    } //you are not tested on this method but use it for debugging purposes

}