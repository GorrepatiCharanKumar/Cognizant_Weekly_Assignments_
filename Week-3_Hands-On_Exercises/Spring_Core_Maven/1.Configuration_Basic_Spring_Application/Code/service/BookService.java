
package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository repository;

    public void setBookRepository(BookRepository bookRepository) {
    this.repository = bookRepository;  
    }


    public void addBook(String title) {
        System.out.println("BookService: Adding book - " + title);
        repository.save(title);
    }
}