package checkpoint;

public class Author {

    private String name;
    private String email;
    private int age;


    Author(){};

    public Author(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }


    class Book {
        private String title;
        private Author author;
        private String published_date;
        private String genre;
        private int pages;

        public Book(String title, Author author, String published_date, String genre, int pages) {
            this.title = title;
            this.author = author;
            this.published_date = published_date;
            this.genre = genre;
            this.pages = pages;
        }
    }


}
