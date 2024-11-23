package com.api.book.bootrestbook;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.book.bootrestbook.dao.BookRepository;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookRepository bookRepository;

    @Disabled
    @ParameterizedTest
    @CsvSource({
        "152"
    })
    public void getbookById(int id){
        assertNotNull(bookRepository.findById(id));
    }

    @ParameterizedTest
    public void getbook(int id){
        assertNotNull(bookRepository.findById(id));
    }
    
}
