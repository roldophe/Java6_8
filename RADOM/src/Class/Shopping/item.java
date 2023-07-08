package Class.Shopping;

public class item {
    private String name;
    private double totalPrice;
    private int qty;
    public item(String name, int qty, double unitPrice){
        this.name = name;
        this.qty = qty;
        totalPrice=qty*unitPrice;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
