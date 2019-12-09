package iterators;

import library.Book;
import library.BookCatalogue;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorIterator implements Iterator{
    private BookCatalogue catalogue;
    private int cur;
    private List<Book> books;

    public AuthorIterator(BookCatalogue catalogue,String name) {
        this.catalogue = catalogue;
        cur = -1;
        books = catalogue.getBooks().stream().filter((b)->b.getAuthor().equals(name)).collect(Collectors.toList());
    }

    public boolean hasNext() {
        if(books.size()>cur+1){
            return true;
        }else{
            return false;
        }
    }

    public Book next() {
        cur++;
        return books.get(cur);
    }
}