package checkpoint;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private Author author;




    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    public Library(List<Book> books) {
        this.books = books;
    }


    public String sortedListOfBooks(){

        Book book = new Book("title", author, "published_date", "genre", 100);

        String result = book.toString();

        List<String> books = new ArrayList<>();
          books.add(result);

        Collections.sort(books);

        return books.toString();


    }

    public String search(String title){

        Book book = new Book("title",author, "published_date", "genre", 100 );
          if(!title.equals(book.getTitle())){
               return null;
          } else {
              return title;

          }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", author=" + author +
                '}';
    }
}
