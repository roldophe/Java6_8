package InnerClass.StaticInnerDemo;
class outer{
    int outerValue;
    String outerMessage;
    static String staticOuterMessage;

    static class Inner{
        int innerValue;
        void innerMessage(){
            System.out.println("InnerValue: "+innerValue);
            System.out.println("Here is staticOuterMessage: "+staticOuterMessage);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        //create object of outer
        outer.Inner outerInner = new outer.Inner();
        outer.staticOuterMessage="hello world";
        outerInner.innerValue=99;
        outerInner.innerMessage();
    }
}
