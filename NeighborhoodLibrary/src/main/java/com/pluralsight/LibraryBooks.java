package com.pluralsight;

import java.util.Scanner;

public class LibraryBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an array to hold the inventoryof books
        Book[] inventory = new Book[20];
        int listChoic = 20;

        // Populate the inventory of the list of books
        Book inventory0 = new Book(100211, "TAL973412359", "The Art Of Laziness",
                true, "Gebrit");
        inventory[0] = inventory0;
        inventory[1] = new Book(100212, "TPH978882350", "The Power of Habit",
                false, "Semere");
        inventory[2] = new Book(100213, "TPH9734879777", "The Art of Thinking Clearly",
                true, "Natnael");
        inventory[3] = new Book(100214, "HOP769977895", "Hidden Potential",
                true, "Ariam");
        inventory[4] = new Book(100215, "SBI712347977", "surrounded by idiots",
                false, "Delina");
        inventory[5] = new Book(100216, "GVG76688890", "Good Vibes Good Life",
                true, "Tina");
        inventory[6] = new Book(100217, "SAE123560900", "Same as Ever",
                true, "Acton");
        inventory[7] = new Book(100218, "BBA6665550900", "When Breath Becomes Art",
                false, "Acton");
        inventory[8] = new Book(100219, "SWW222560911", "Start With Why",
                true, "Charles");
        inventory[9] = new Book(1002120, "TPM557760880", "The Psychology of Money",
                false, "Gebrit");
        inventory[10] = new Book(1002121, "BHE333336780", "Behave",
                true, "Acton");
        inventory[11] = new Book(1002122, "WMF87971078", "Be Water My Friend",
                true, "Semere");
        inventory[12] = new Book(1002123, "TWH11171078", "The WIM HOF Method",
                false, "Natnael");
        inventory[13] = new Book(1002124, "TDS1132271078", "The Daily Stoic",
                true, "Delina");
        inventory[14] = new Book(1002125, "TED000112300", "Talk Like TED",
                false, "Charles");
        inventory[15] = new Book(1002126, "WOA0000111156", "theWARofArt",
                true, "Onriel");
        inventory[16] = new Book(1002127, "NFM111000333", "Your Next Five Moves",
                true, "Gebrit");
        inventory[17] = new Book(1002128, "MYB888777780", "MAKE YOUR BED",
                false, "Acton");
        inventory[18] = new Book(10021929, "TYH44455789", "TINY HABITS",
                true, "Tina");
        inventory[19] = new Book(1002130, "TAG20000101", "Think Again",
                true, "Gebrit");
        Book bk = new Book();

        System.out.println("Welcome to the library");
        System.out.println("Enter 1. To check in a book");
        System.out.println("Enter 2. To check out a book");
        System.out.println("Enter 3. To Exit the Page");
        System.out.println("Enter your choice of the books: ");
        int listChoice = scanner.nextInt();
        while (listChoice != 3) {
            switch (listChoice) {
                case 1:
                    showAvailableBooks(inventory);
                    break;
                case 2:
                    showCheckedOutBook(inventory, "Talk Like TED");
                    break;
                case 3:
                    exitToCloseApplication();
                    break;
            }
            System.out.println("Enter your command: ");
            listChoice = scanner.nextInt();
        }
    }


    private static void showCheckedOutBook(Book[] inventorys, String title) {
        for (Book book : inventorys) {
            if (book != null && book.isCheckedOut() == true) {
                //book.setCheckedOut(true);
                System.out.println(book);
            }

        }
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
       // while (!choice.equals("X")) {
            switch (choice) {
                case "C":
                    System.out.println("Enter the ID of the book to check in: ");
                    int bookId = input.nextInt();

                    break;
                case "X":
                    System.out.println("Going back to the home screen.");
                    break;
                default:
                System.out.println("Invalid choice. Please try again");
                break;
            }
        }


            private static void showAvailableBooks (Book[]inventors){
                for (Book book : inventors) {
                    if (book != null && book.isCheckedOut() == false) {
                        System.out.println(book);
                    }
                }
            }

            private static void exitToCloseApplication () {
                System.out.println("Exit from application: ");

            }

        }


