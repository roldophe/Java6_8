package Class.Shopping;

public class TestCart {
    public static void main(String[] args) {
        item pen = new item("ball pen",3,5);
        item laptop = new item("HP laptop",1, 15000);
        item mobile = new item("Samsung",2,20000);
        item wire = new item("cat 1", 1, 100);
        item book = new item("opp",2,10);
        shoppingCart qasim;
        qasim = new shoppingCart();
        qasim.addrItem(pen);
        qasim.addrItem(mobile);
        qasim.addrItem(laptop);
        qasim.addrItem(wire);
        qasim.addrItem(book);
        System.out.println(qasim.calculateTotalPrice());
    }
}
