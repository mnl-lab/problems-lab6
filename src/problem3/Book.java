package problem3;

public class Book extends Document {
    private String author;
    private int nbPages;

    public Book(String title, String author, int nbPages) {
        super(title);
        this.author = author;
        this.nbPages = nbPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    @Override
    public String toString() {
        return super.toString() + " | Book [author=" + author + ", nbPages=" + nbPages + "]";
    }
}
