
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private double price;

    public Book(String title, String author, String publisher, int yearOfPublication, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + yearOfPublication + "), " +
               publisher + " - $" + price;
    }
}
