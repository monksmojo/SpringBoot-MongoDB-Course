package com.javaTechie.springBoot.mongoDBcrud.controller;

import com.javaTechie.springBoot.mongoDBcrud.entity.Book;
import com.javaTechie.springBoot.mongoDBcrud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping(path = "/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @PostMapping(path = "/add-book")
    public ResponseEntity<String>

}
