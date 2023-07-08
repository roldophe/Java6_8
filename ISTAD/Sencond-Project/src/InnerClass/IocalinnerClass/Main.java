package InnerClass.IocalinnerClass;

public class Main {//Outer class
    int data = 123;
    String message = "main main main";

    class InnerClass { // inner class of Main Class
        int innerData = data;
        String innerMessage = "Inner Inner";

        void printInner() {
            System.out.println("This is from inner class.");
        }

        void printInnerMessage() {
            System.out.println("Inner Message: " + this.innerMessage);
        }

    }

    void printMain() {
        System.out.println("This is from the main Class.");
    }

    void printMessage() {
        System.out.println("Main message: " + this.message);
    }

    //Normal nested class
    public static void main(String[] args) {
        Main obj = new Main();
        Main.InnerClass innerObj = obj.new InnerClass();
        System.out.println("innerObj Data: " + innerObj.innerData);
        System.out.println("innerObj Message: " + innerObj.innerMessage);
    }
}
