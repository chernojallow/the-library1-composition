package checkpoint;

public class Report {
    private String title;
    private final Author author;
    private String published_date;


    public Report(Author author){
        this.author= author;
    }

    public Report(String title, Author author, String published_date) {
        this.title = title;
        this.author = author;
        this.published_date = published_date;
    }


}
