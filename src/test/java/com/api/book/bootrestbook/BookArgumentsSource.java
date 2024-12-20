package com.api.book.bootrestbook;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import com.api.book.bootrestbook.entities.Book;


public class BookArgumentsSource implements ArgumentsProvider{

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(Arguments.of(Book.builder().title("Comlete Refrance").id(152)));
    }
    
}
