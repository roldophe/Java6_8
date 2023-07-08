package Constructor.Book;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this("RADOM","KHOEM");
        System.out.println("this a constructor without parameter!");
    }

    public Book(String title) {
        this.title = title;
        System.out.println("Constructor with one parameter!");
    }

    public Book(String title, String author) {
        //this.title = title;
        this(title);
        this.author = author;

        System.out.println("This is a constructor with two parameters.");

    }

    public Book(String title, String author, double price) {
        //this.title = title;
        //this.author = author;
        this(title,author);// reuse
        this.price = price;
        System.out.println("This a constructor with three parameters.");
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
