package library;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMain {

    static Genre genre;

    public static void main(String[] args) {

        System.out.println(initWithDefaultValues());

        System.out.println(getBookByGenre(genre = Genre.HORROR));
    }


    public static Map<Genre, Book> initWithDefaultValues() {

        Map<Genre, Book> listOfBooks = new HashMap<Genre, Book>();

        Book book1 = new Book("HR", "Jungle library.Book", 1991);
        Book book2 = new Book("JR", "Eating library.Book", 2020);
        Book book3 = new Book("LL", "Kill the zombies", 2012);
        Book book4 = new Book("OP", "Wedding", 2018);
        Book book5 = new Book("BP", "Sunshine", 1881);

        listOfBooks.put(Genre.ACTION, book1);
        listOfBooks.put(Genre.THRILLER, book2);
        listOfBooks.put(Genre.HORROR, book3);
        listOfBooks.put(Genre.COMEDY, book4);
        listOfBooks.put(Genre.HORROR, book5);

        return listOfBooks;
    }

    public static Set<Book>[] getBookByGenre(Genre genre) {

        Set<Book>[] listOfBooks = new Set<Book>;
        int book = 0;

        for (Set<Book> books : listOfBooks) {
            if (initWithDefaultValues().containsKey(Genre.values().equals(genre))) {    //(Genre.values().equals(genre))){


                book++;
                return listOfBooks;
            }
            // }
            return null;
        }
    }
}
