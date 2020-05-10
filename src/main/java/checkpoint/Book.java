package checkpoint;

public class Book {
    private String title;
    private final Author author;
    private String published_date;
    private String genre;
    private int pages;




   public Book(Author author){
        this.author = author;
    };



    public Book(String title, Author author, String published_date, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.published_date = published_date;
        this.genre = genre;
        this.pages = pages;

      }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", published_date='" + published_date + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                '}';
    }
}
