package NestedClassPractice;

import java.util.Scanner;

public class Circle {
    public static class Point {
        private int x;
        private int y;

        public void input() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter x: ");
            x = scanner.nextInt();
            System.out.print("Enter y: ");
            y = scanner.nextInt();
        }

        public void output() {
            System.out.println("Point(" + x + "," + y + ")");
        }
    }

    Point point = new Point();
    private float radius;

    public float area() {
        return (float) (3.14 * radius * radius);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        point.input();
        System.out.println("Input radius: ");
        radius = scanner.nextFloat();
    }

    public void output() {
        point.output();
        System.out.println("Radius: " + radius + "\t" + "Area: " + area());
    }

    public static void main(String[] args) {

        Circle.Point point = new Circle.Point();
        point.input();
        point.output();
        Circle obj = new Circle();
        obj.input();
        obj.output();

    }
}
