package org.example.design.designpatterns.behaviour.iterator;

import java.util.ArrayList;
import java.util.List;

public class LibraryOrConcreateAggregator implements Aggregate {

    List<Book> bookList;

    public LibraryOrConcreateAggregator() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public MyIterator createIterator() {
        return new BookIterator(bookList);
    }
}
