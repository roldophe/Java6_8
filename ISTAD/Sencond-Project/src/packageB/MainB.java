package packageB;

import packageA.Robot;

public class MainB extends Robot {
    public static void main(String[] args) {
        MainB mainB = new MainB();
        mainB.serialNumber = 101;
        mainB.chipSet = "Tesla xy";
        mainB.model = "Vigen";
        mainB.wald();
        System.out.println(mainB.toString());

    }
}
