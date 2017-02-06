package com.company.javaguruTasks;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int randomNum = randomGenerator.nextInt(101);
        System.out.println("I am thinking of a number...");

        Scanner sc = new Scanner(System.in);
        int inputNum;

        do { System.out.println("Input your guess: ");
            inputNum = sc.nextInt();
            if (inputNum > randomNum) {
                System.out.println("Random number is smaller than your guess. Please guess again.");
            } else if (inputNum < randomNum) {
                System.out.println("Random number is bigger than your guess. Please guess again.");
            }
        } while (inputNum != randomNum);

        System.out.println("You have guessed the number: " + randomNum);
    }
}