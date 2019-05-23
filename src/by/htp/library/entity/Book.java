package by.htp.library.entity;

public class Book {
    private int id;
    private String title;
    private String genre;

    public Book(int id, String title, String genre) {
        super();
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Book() {
        super();

    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ",genre=" + genre + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    public void setId(int id) {
        this.id = id;

    }

    public void setTitle(String title) {
        this.title = title;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
