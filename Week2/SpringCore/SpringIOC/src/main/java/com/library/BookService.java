package com.library;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void display(){
        System.out.println("BookService Bean Created");
        bookRepository.display();
    }
}
