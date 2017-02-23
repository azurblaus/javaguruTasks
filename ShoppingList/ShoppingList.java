package lv.javaguru;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class ShoppingList {

    private static final int ITEM_TO_ADD = 1;
    private static final int LIST_ITEMS = 2;
    private static final int DELETE_ITEM = 3;
    private static final int EXIT = 4;

    private static Scanner scanner = new Scanner(in);


    public static void userInput(List<String> list) {
        int userChoice = 0;
        do {
            showMenu();
            try {
                userChoice = Integer.parseInt(scanner.nextLine());
                switch (userChoice) {
                    case ITEM_TO_ADD:
                        addItem(list);
                        break;
                    case LIST_ITEMS:
                        displayItems(list);
                        break;
                    case DELETE_ITEM:
                        deleteItem(list);
                        break;
                    case EXIT:
                        exitMenu();
                        break;
                    default:
                        System.out.println("\nwrong choice");
                }
            } catch (Exception e) {
                System.out.println("\nwrong choice");
            }
        }
        while (userChoice != 4);
    }


    public static void addItem(List<String> list) {
        System.out.print("Enter item to add: ");
        String itemToAdd = scanner.nextLine();
        list.add(itemToAdd);
        System.out.println(itemToAdd + " added");
    }


    public static void displayItems(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("Your shopping list is empty!");
        } else {
            for (String item : list) {
                System.out.println(item);
            }
        }
    }

    public static void deleteItem(List<String> list) {
        System.out.print("Enter item to delete: ");
        String itemToDelete = scanner.nextLine();
        if (list.contains(itemToDelete)) {
            list.remove(itemToDelete);
            System.out.println(itemToDelete + " deleted");
        } else {
            System.out.println(itemToDelete + " is not in the shopping list");
        }
    }

    public static void exitMenu() {
        System.out.println("Good buy!");
    }


    public static void showMenu() {
        System.out.println("\nThis is a shopping list application menu:");
        System.out.println("1 - add an item");
        System.out.println("2 - list items");
        System.out.println("3 - delete an item");
        System.out.println("4 - exit");
        System.out.println();
        System.out.print("Enter your choice: ");

    }
}

