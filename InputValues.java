package com.company.javaguruTasks;

import java.util.*;

public class InputValues {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();

    
    public void checkTheBiggest() {

        if (x > y && x > z)
            System.out.println("First number is largest.");
        else if (y > x && y > z)
            System.out.println("Second number is largest.");
        else if (z > x && z > y)
            System.out.println("Third number is largest.");
        else
            System.out.println("All numbers are equal.");
    }

    public static void main(String[] args) {
        InputValues a = new InputValues();
        a.checkTheBiggest();
    }
}




































 /*   public int usersInput(){
       int[] inputValue = new int[3];
        for (int i = 0; i < inputValue.length; i++) {
            System.out.println("Input new number: ");
            int input = scanner.nextInt();
            inputValue[i] = input;
        }
            return input;
        }

    public void compareTheInputs(){
        if (usersInput(input )

    }

} */