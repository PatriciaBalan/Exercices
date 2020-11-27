package library;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static library.Genre.*;

public class TestMain {

    static Genre genre;

    public static void main(String[] args) {

        System.out.println(initWithDefaultValues());

        genre = HORROR;
        getBookByGenre(initWithDefaultValues().get(genre));

    }


    public static HashMap<Genre, HashSet<Book>> initWithDefaultValues() {

        HashMap<Genre, HashSet<Book>> listOfBooks = new HashMap<Genre, HashSet<Book>>();

        Book book1 = new Book("HR", "Jungle library.Book", 1991);
        Book book2 = new Book("JR", "Eating library.Book", 2020);
        Book book3 = new Book("LL", "Kill the zombies", 2012);
        Book book4 = new Book("OP", "Wedding", 2018);
        Book book5 = new Book("BP", "Sunshine", 1881);

        listOfBooks.put(ACTION, book1);
        listOfBooks.put(THRILLER, book2);
        listOfBooks.put(HORROR, book3);
        listOfBooks.put(COMEDY, book4);
        listOfBooks.put(HORROR, book5);

        return listOfBooks;
    }

//    public static Set<Book> getBookByGenre(Genre genre) {
//
//        Set<Book> listOfBooks = new HashSet<Book>();
//
//        for (Set<Book> books : listOfBooks) {
//            if (initWithDefaultValues().get(Genre.values()); //Genre.values().equals(genre))) {    //(Genre.values().equals(genre))){
//                return listOfBooks;
//            }
//        }
//        return null;
//    }

    public static void getBookByGenre (Set<Book> books) {
        for (Set<Book> book:initWithDefaultValues().get(genre)) {
            System.out.println(books);
        }
    }
}
