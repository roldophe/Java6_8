package Polymorphism.Overload;
class Utils{
    void sum(){}
    int sum(int a, int b){return a+b;}
    float sum(float a, float b){return a+b;}
    String sum(String a, String b){return a+b;}
}
public class Main {
    public static void main(String text) {
        System.out.println("This is the void main being overload...!"+text);
    }
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.sum();
        System.out.println("Sum(String,String):"+utils.sum("RADOM"," KHOEM"));
        System.out.println("Sum(int, int): "+utils.sum(12,56));
        System.out.println("Sum(float, float): "+utils.sum(1.2f,5.6f));
        main("Love you\3");
    }
}
