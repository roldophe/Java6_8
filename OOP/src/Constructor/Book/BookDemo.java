package Constructor.Book;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1);
        System.out.println("-----------------------------------------");
        Book book2 = new Book("JAVA");
        System.out.println(book2);
        System.out.println("-----------------------------------------");
        Book book3 = new Book("JAVA", "JAME Gosling");
        System.out.println(book3);
        System.out.println("-----------------------------------------");
        Book book4 = new Book("C programming ", "Danish Reachie", 45);
        System.out.println(book4);
    }
}
