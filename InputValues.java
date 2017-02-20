package com.company.javaguruTasks;

import java.util.*;

public class InputValues {
    Scanner scanner = new Scanner(System.in);
    private int x;
    private int y;
    private int z;


    public void checkTheBiggest() {
        if ((x == y) && (y == z)) {
            System.out.println("A == B == C");
        } else {
            System.out.println("Three numbers are not equal");
        }
    }


    public void setInitialValues() {
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
    }

    public static void main(String[] args) {
        InputValues a = new InputValues();
        a.setInitialValues();
        a.checkTheBiggest();
    }
}
