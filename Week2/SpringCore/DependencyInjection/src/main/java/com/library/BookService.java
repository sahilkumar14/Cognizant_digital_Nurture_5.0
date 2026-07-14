package com.library;

public class BookService {
    private BookRepository bookRepository;

    //Setter Injection
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void display(){
        System.out.println("BookService is working...");
        bookRepository.display();
    }
}
