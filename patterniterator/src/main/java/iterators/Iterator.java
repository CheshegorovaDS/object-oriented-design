package iterators;

import library.Book;
import library.BookCatalogue;

public interface Iterator {
    boolean hasNext();
    Book next();
}
