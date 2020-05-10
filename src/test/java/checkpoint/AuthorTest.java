package checkpoint;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AuthorTest {

    private  Author author;

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
    void bookObject_Needs_AuthorTest(){
        //set
        Book book = new Book(author);
        //exercise and assert
        assertNotNull(book);

      }

}
