package com.library;

import org.springframework.stereotype.Component;

@Component
public class LibraryService {
    public void issueBook(String title) {
        System.out.println("Book issued: " + title);
    }
}