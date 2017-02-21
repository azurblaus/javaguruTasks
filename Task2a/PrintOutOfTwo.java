package com.company.javaguruTasks.Task2;


import java.util.*;

public class PrintOutOfTwo {
    private Scanner scanner = new Scanner(System.in);
    private int firstNum;
    private int secondNum;

    public void computerAsksTheNum() {
        System.out.println("Please input a whole number: ");
    }

    public void createFirstNum() {

        boolean firstNumberApproved = false;

        while (!firstNumberApproved) {
            computerAsksTheNum();
            try {
                firstNum = Integer.parseInt(scanner.nextLine());
                firstNumberApproved = true;
            } catch (Exception e) {
                System.out.println("ONLY whole numbers allowed!");
            }
        }
    }

    public void createSecondNum() {

        boolean secondNumberApproved = false;

        while (!secondNumberApproved) {
            computerAsksTheNum();
            try {
                secondNum = Integer.parseInt(scanner.nextLine());
                secondNumberApproved = true;
            } catch (Exception e) {
                System.out.println("ONLY whole numbers allowed!");
            }
        }
    }

    public void compareInputNum() {
        if (firstNum > secondNum) {
            System.out.println("The biggest one is " + firstNum);
        } else if (firstNum < secondNum) {
            System.out.println("The biggest one is " + secondNum);
        } else {
            System.out.println("A == B");
        }
    }
}