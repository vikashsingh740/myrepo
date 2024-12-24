package org.example.design.designpatterns.behaviour.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        LibraryOrConcreateAggregator aggregate = new LibraryOrConcreateAggregator();
        aggregate.addBook(new Book("ABC",100));
        aggregate.addBook(new Book("PQR",200));
        aggregate.addBook(new Book("XYZ",300));

        MyIterator iterator = aggregate.createIterator();
        while (iterator.hashNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.name+" : "+book.price);
        }
    }
}
