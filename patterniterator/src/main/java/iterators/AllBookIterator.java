package iterators;

import library.Book;
import library.BookCatalogue;

public class AllBookIterator implements Iterator {
    private BookCatalogue bookCatalogue;
    private int current;

    public AllBookIterator(BookCatalogue bookCatalogue) {
        this.bookCatalogue = bookCatalogue;
        current = -1;
    }

    public boolean hasNext() {
        if(bookCatalogue.getBooks().size()>current+1){
            return true;
        }else{
            return false;
        }
    }

    public Book next() {
        current++;
        return bookCatalogue.getBooks().get(current);
    }
}
