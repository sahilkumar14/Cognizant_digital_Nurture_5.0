package com.spring.basicSpringApplication.repository;

import com.spring.basicSpringApplication.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
