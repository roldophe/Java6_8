package Class.Shopping;

public class shoppingCart {
    private item[] cart;
    private double totalPrice;
    private int storedItems;
    public shoppingCart(){
        cart = new item[5];
    }
    public shoppingCart(int cartSize){
        cart = new item[cartSize];
    }
    public void addrItem(item input){
        if (storedItems<cart.length){
            cart[storedItems]=input;
            storedItems++;
        }
    }
    public double calculateTotalPrice(){
        for (int i=0; i<cart.length; i++)
        {
            totalPrice+=cart[i].getTotalPrice();
        }
        return totalPrice;
    }
}
