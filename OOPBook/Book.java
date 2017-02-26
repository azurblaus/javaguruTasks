package lv.javaguru;

public class Book {
    private String author;
    private String title;
    private int releaseYear;
    private int numOfPages;

    public String getAuthor() {
        return author;
    }

    public Book (String author, String title, int releaseYear, int numOfPages) {
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
        this.numOfPages = numOfPages;
    }

    public Book(){
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", numOfPages=" + numOfPages +
                '}';
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
}
