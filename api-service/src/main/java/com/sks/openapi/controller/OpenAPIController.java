package com.sks.openapi.controller;

import com.sks.api.BooksApi;
import com.sks.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OpenAPIController implements BooksApi {
    @Override
    public ResponseEntity<List<Book>> booksInjavaSKS() {
        List<Book> books=new ArrayList<>();
        Book book=new Book();
        book.setName("JavaSKS");
        book.setBookAuthor("Sandeep");
        books.add(book);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
