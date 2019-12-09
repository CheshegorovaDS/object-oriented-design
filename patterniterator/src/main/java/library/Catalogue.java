package library;

import iterators.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private Library books;
    private Iterator iterator;

    public Catalogue(Library books) {
        this.books = books;
    }

    public List<Book> getBooksByTitle(String name){
        List<Book> list = new ArrayList<Book>();
        iterator = books.createBooksIterator(name);
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getName().equals(name)) {
                list.add(book);
            }
        }
       return list;
    }

    public List<Book> getBooksByAuthor(String name){
        List<Book> list = new ArrayList<Book>();
        iterator = books.createAuthorIterator(name);
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
}
