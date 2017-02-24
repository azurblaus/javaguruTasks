package lv.javaguru;

import java.util.Scanner;

public class StringConversion {

    public static void main(String[] args) {
        System.out.print("Please input a String that will be converted as an Integer: ");
        Scanner scanner = new Scanner(System.in);
        try {
            String number = scanner.nextLine();
            double sum = 0.0;
            for (String string : number.split(" ")) {
                double convertedString = Double.parseDouble(string);
                sum += convertedString;
            }
            System.out.println(sum);
        } catch (NumberFormatException e) {
            System.out.println("Please input a String that contains ONLY numbers!");
        }
    }
}
