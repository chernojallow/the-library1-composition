package checkpoint;

public class Book {
    private String title;
    private final Author author;
    private String published_date;
    private String genre;
    private int pages;


    Book(Author author){
        this.author = author;
    };

    public Book(String title, Author author, String published_date, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.published_date = published_date;
        this.genre = genre;
        this.pages = pages;
    }


}
