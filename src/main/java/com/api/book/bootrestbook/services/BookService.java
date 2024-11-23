package com.api.book.bootrestbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Component
public class BookService {
    @Autowired
    private BookRepository bookRepository;

        
    // to get allbooks
    public List<Book> getAllBook(){

        List<Book> list =(List<Book>) this.bookRepository.findAll();
        return list;
    }

    //to get single book
    public Book getBookById(int id){
        Book book = null;

        try{
         
               book = this.bookRepository.findById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return book;
    }

    //To add new book
    public Book addBook(Book b){
        Book result = bookRepository.save(b);
        return result;
    }

    // To delete book
    public void deleteBook(int bid){
       

        bookRepository.deleteById(bid);
    }

    // To update book
    public void updateBook(Book book,int bookId){
   

    book.setId(bookId);
    bookRepository.save(book);
       
    }
   
}