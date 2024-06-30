package test;

import java.util.ArrayList;
import java.util.Scanner;
import models.PhoneBook;

public class ManagePhoneBook {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("", "", "");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("___MENU___");
            System.out.println("1. Insert Phone.");
            System.out.println("2. Remove Phone.");
            System.out.println("3. Update Phone.");
            System.out.println("4. Search Phone.");
            System.out.println("5. Sort.");
            System.out.println("6. Exit.");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
                    phoneBook.insertPhone(name, phone);
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    String nameRemove = sc.nextLine();
                    phoneBook.removePhone(nameRemove);
                    break;
                case 3:
                    System.out.print("Enter name to update: ");
                    String nameToUpdate = sc.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhone = sc.nextLine();
                    phoneBook.updatePhone(nameToUpdate, newPhone);
                    break;
                case 4:
                    System.out.print("Enter name to search: ");
                    String nameToSearch = sc.nextLine();
                    phoneBook.searchPhone(nameToSearch);
                    break;
                case 5:
                    phoneBook.sort();
                    System.out.println("Phone book sorted by name.");
                    break;
                case 6:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                    break;
            }
        } while (choice != 6);
    }
}

