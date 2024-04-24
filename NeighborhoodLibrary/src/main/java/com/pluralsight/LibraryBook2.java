package com.pluralsight;

import java.util.Scanner;

public class LibraryBook2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an array to hold the inventoryof books
        Book[] inventory = new Book[20];
        //int listChoic = 20;

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

        boolean exit = false;
        int listChoice = scanner.nextInt();
        while (listChoice < 4 && listChoice <1 && listChoice >4)
            switch (listChoice) {
                case 1:
                    availableBooks(inventory);
                    break;
                case 2:
                    checkOutBooks(inventory);
                    break;
                case 3:
                    exitHomeScreen(inventory);
                    break;
                    /*
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                    listChoice =scanner.nextInt();

                     */

            }
        System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        listChoice =scanner.nextInt();
    }
    private static void availableBooks(Book[] inventory) {
        System.out.println("\n---Available Books ---");
        System.out.println(inventory);
        boolean available = false;
        for (Book book : inventory) {
            if (!book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
                available = true;
            }
        }
    }
    private static void checkOutBooks(Book[] inventory) {
        System.out.println("\n--- Check out books ---");
        boolean checkedOut = false;
        for (Book book : inventory){
            if(book.isCheckedOut()){
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
                checkedOut = true;
                System.out.println(inventory);
                System.out.println(book.toString());

            }
        }
        System.out.print("Enter 'C' to check in book or 'X' ");
        /*String choice;
        choice = scanner.next().toUpperCase();
        switch (choice){
            case 'C':
                checkInBook(inventory, scanner);
                break;
            case 'X':
                break;
            default:
                System.out.println("Invalid choice");

         */

        }

    private static void exitHomeScreen(Book[] inventory) {
       // for (Book book : inventory) {
           // if (inventory != null) {
               // System.out.println(inventory);
                System.out.println("Exit from application: ");
            }
        }
    //}
//}