package Class.Constructor;

public class BookService {

    public Book[] createBooks(int numberOfBook) {
        Book[] books = new Book[numberOfBook];
        for (int i = 0; i < numberOfBook; i++) {
            books[i] = createBook();
        }
        return books;
    }

    public Book createBook() {
        String title = Utils.getString("Please input title: ");
        String author = Utils.getString("Please input author: ");
        double price = Utils.getDouble("Please input price: ");
        Book book = new Book(title, author, price);
        return book;
    }

    public void print(Book[] books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void sort(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i].getPrice() > books[j].getPrice()) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }

    public double totalAmount(Book[] books) {
        double total = 0.0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }


/**    public double getDouble(String label) {
 System.out.print(label);
 Scanner scanner = new Scanner(System.in);
 return scanner.nextDouble();
 }
 */
}
