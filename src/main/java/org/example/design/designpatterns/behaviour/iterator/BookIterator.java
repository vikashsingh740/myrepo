package org.example.design.designpatterns.behaviour.iterator;

import java.util.List;

public class BookIterator implements MyIterator {

    List<Book> bookList;
    int index = 0;

    public BookIterator(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean hashNext() {
        return bookList.size() > index;
    }

    @Override
    public Object next() {
        return bookList.get(index++);
    }
}
