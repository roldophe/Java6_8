package InnerClass.IocalinnerClass;

public class TestingLocalInnerClass {
    private int data = 30;//instance variable

    void display() {// method or behaviour
        class Local { // Local inner class
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        TestingLocalInnerClass obj = new TestingLocalInnerClass();
        obj.display();
    }
}
