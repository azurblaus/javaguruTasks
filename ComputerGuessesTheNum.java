package com.company.javaguruTasks;

import java.util.Scanner;

public class ComputerGuessesTheNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playersNum;
        int highestLimit = 100;
        int lowestLimit = 0;
        String playersAnswer;

        do {
            playersNum = (highestLimit + lowestLimit + 1) /2;
            System.out.println("Is your number  " + playersNum + "?");
            playersAnswer = sc.nextLine();

            if (playersAnswer.equals("<")) {
                highestLimit = playersNum + 1;
            } else if (playersAnswer.equals(">")) {
                lowestLimit = playersNum - 1;
            }
                } while (!playersAnswer.equals("Yes"));
        sc.close();
        System.out.println("Game over!");
    }
}
