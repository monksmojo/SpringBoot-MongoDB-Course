package com.examples.kris.springBootmongo.service;

import com.examples.kris.springBootmongo.entity.Book;
import com.examples.kris.springBootmongo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Collection<Book> getAllBook(){
        return bookRepository.findAll();
    }

    public Book getBookById(Long bookId){
        return bookRepository.findById(bookId).orElse(null);
    }

    public Book getBookByName(String bookName){
        return bookRepository.findByBookName(bookName);
    }

    public Book getBookByAuthor(String authorName){
        Book book= bookRepository.findByAuthor(authorName);
        return book;
    }

    public Boolean addBook(Book book){
        bookRepository.insert(book);
        return true;
    }

    public Boolean removeBook(Long bookId){
        bookRepository.deleteById(bookId);
        return true;
    }


}
