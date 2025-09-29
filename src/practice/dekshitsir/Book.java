package practice.dekshitsir;

public class Book{
    private String title;
    private String author;
    private String ISBN;
    private int copiesAvailable;

    public Book(String title,String author,String ISBN,int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public void borrowBook() {
        if (copiesAvailable > 0) {
            copiesAvailable--;
            System.out.println("Borrowed successfully!");
        } else {
            System.out.println("Sorry, no copies available.");
        }
    }

    public void returnBook() {
        copiesAvailable++;
        System.out.println("Book returned successfully!");
    }
    @Override
    public String toString() {
        return "Book[" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", copiesAvailable=" + copiesAvailable +
                ']';
    }
}
