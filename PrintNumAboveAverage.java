package com.company.javaguruTasks;

public class PrintNumAboveAverage {
    public static void main(String[] args) {

        int[] array = {23, 65, 23, 99, 1};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = (double) sum / array.length;
        System.out.println("Average is " + average);

        for (int j = 0; j < array.length; j++) {
            if (array[j] > average) {
                System.out.println("Numbers bigger than the average " + array[j]);
            }
        }
    }
}