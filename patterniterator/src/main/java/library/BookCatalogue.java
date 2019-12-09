package library;

import iterators.AllBookIterator;
import iterators.AuthorIterator;
import iterators.Iterator;

import java.util.List;

public class BookCatalogue implements Library{
    private List<Book> books;

    public BookCatalogue(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Iterator createBooksIterator(String name) {
        return new AllBookIterator(this);
    }

    public Iterator createAuthorIterator(String author) {
        return new AuthorIterator(this,author);
    }
}
