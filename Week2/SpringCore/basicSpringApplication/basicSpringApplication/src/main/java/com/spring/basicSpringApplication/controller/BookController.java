package com.spring.basicSpringApplication.controller;

import com.spring.basicSpringApplication.entity.Book;
import com.spring.basicSpringApplication.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository repository;

    public BookController(BookRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return repository.save(book);
    }

    @GetMapping
    public List<Book> getBooks(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,@RequestBody Book book){
        Book existing = repository.findById(id).orElse(null);

        if(existing != null){
            existing.setTitle(book.getTitle());
            existing.setAuthor(book.getAuthor());
            return repository.save(existing);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id){
        repository.deleteById(id);

        return "Book Deleted SuccessFully";
    }
}
