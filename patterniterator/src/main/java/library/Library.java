package library;

import iterators.Iterator;

public interface Library {
    Iterator createBooksIterator(String name);
    Iterator createAuthorIterator(String author);
}
