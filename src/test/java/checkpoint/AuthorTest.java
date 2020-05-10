package checkpoint;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorTest {

    private  Author author;
    private List<Book> books;

    @Test
    void authorObjectTest(){
        //set
        Author author = new Author("name", "email", 30);
        //exercise and assert
        assertNotNull(author);
      }

    @Test
    void bookObjectTest(){
        //set
        Book book = new Book("title", author, "published_date", "genre", 100);
        //exercise and assert
        assertNotNull(book);
        }

    @Test
    void bookObject_Needs_Author_Test(){
        //set
        Book book = new Book(author);
        //exercise and assert
        assertNotNull(book);

         }

    @Test
    void reportObject_Test(){
        //set
        Report report = new Report("title", author, "published_date");
        //exercise and assert
        assertNotNull(report);

        }

    @Test
    void libraryObject_Test(){
        //set
        Library  library = new Library(books);
        //exercise and assert
        assertNotNull(library);

         }

    @Test
    void reportObject_Needs_Author_Test(){
        //set
        Report report = new Report(author);
        //exercise and assert
        assertNotNull(report);

      }

      @Test
      void library_object_can_add_book_test(){
        List<Book>books = new ArrayList<>();
        Library library = new Library(books);

          assertNotNull(library);
          assertNotNull(library.getBooks());
      }


      @Test
      void return_sorted_list_of_books(){

          Book book = new Book("title", author, "published_date", "genre", 100);
           List<Book> books = new ArrayList<>();
           books.add(book);

           Library library = new Library(books);

          assertNotNull(library.sortedListOfBooks());

            }

       @Test
      void search_for_book_by_title_test(){
        //Setup
        Library library = new Library(books);
        Book book = new Book("title", author, "published_date", "genre", 100);
        String title = book.getTitle();

        //Exercise and Assert
        assertEquals(title, library.search("title"));
        assertNotEquals(title, library.search("extraction"));

      }

}
