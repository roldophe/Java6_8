package MethodDemo.MethodDemo;
public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c= 3;
        int d = 8;
        addNumbers(a,b);
        int resultTwo = c+d;
    }
    public static void addNumbers(int a, int b){
        int resultOne = a+b;
        System.out.println(resultOne);
    }
}


