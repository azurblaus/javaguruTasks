package com.company.javaguruTasks;

import java.util.Scanner;

public class PrintOutOfTwo {
    private Scanner scanner = new Scanner(System.in);
    private double firstNum;
    private double secondNum;


    public void computerAsksTheNum() {
        System.out.println("Please input a whole number: ");
    }

    public void createFirstNum() {
        computerAsksTheNum();
        firstNum = scanner.nextDouble();
    }

    public void createSecondNum() {
        computerAsksTheNum();
        secondNum = scanner.nextDouble();
    }


    public void validateTheFirstInput() {
        if (firstNum != (int) firstNum) {
            createFirstNum();
        }
    }

    public void validateTheSecondInput() {
        if (secondNum != ((int) secondNum)) {
            createSecondNum();
        }
    }

    public void compareInputNum() {
        if (firstNum > secondNum) {
            System.out.println("The biggest one is " + (int)firstNum);
        } else if (firstNum < secondNum) {
            System.out.println("The biggest one is " + (int)secondNum);
        } else {
            System.out.println("A == B");
        }
    }
}




