package com.library.repository;

public class BookRepository {
    public void save(String title) {
        System.out.println("BookRepository: Book saved - " + title);
    }
}