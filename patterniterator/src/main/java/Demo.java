import library.Book;
import library.BookCatalogue;
import library.Catalogue;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args){
        BookCatalogue books = new BookCatalogue(createBooks());
        Catalogue c = new Catalogue(books);
        List<Book> b = c.getBooksByTitle("Капитанская дочка");
        b.forEach(System.out::println);
        System.out.println("--------------------------------------------");

        List<Book> b1 = c.getBooksByTitle("Детство");
        b1.forEach(System.out::println);
        System.out.println("--------------------------------------------");

        List<Book> b3 = c.getBooksByAuthor("Булгаков М.А.");
        b3.forEach(System.out::println);
        System.out.println("--------------------------------------------");

        List<Book> b4 = c.getBooksByTitle("");
        b4.forEach(System.out::println);
        System.out.println("--------------------------------------------");


    }

    public static List<Book> createBooks(){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Пушкин А.С.","Капитанская дочка"));
        books.add(new Book("Гоголь Н.В.","Мёртвые души"));
        books.add(new Book("Толстой Л.Н.","Война и мир"));
        books.add(new Book("Булгаков М.А.","Белая гвардия"));
        books.add(new Book("Шолохов М.А.","Судьба человека"));
        books.add(new Book("Васильев Б.Л.","А зори здесь тихие"));
        books.add(new Book("Тургенев И.С.","Отцы и дети"));
        books.add(new Book("Булгаков М.А.","Собачье сердце"));
        books.add(new Book("Толстой Л.Н.","Детство"));
        books.add(new Book("Горький М.","Детство"));
        return books;
    }
}
