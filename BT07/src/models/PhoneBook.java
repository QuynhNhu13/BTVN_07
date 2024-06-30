package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {

    private ArrayList<PhoneBook> PhoneList = new ArrayList<>();

    public PhoneBook(String name, String phone, String newPhone) {
        super(name, phone, newPhone);
    }

    @Override
    public void insertPhone(String name, String phone) {
        boolean found = false;
        for (PhoneBook i : PhoneList) {
            if (i.getName().equals(name)) {
                found = true;
                if (!i.getPhone().contains(phone)) {
                    i.setPhone(i.getPhone() + ":" + phone);
                    System.out.println("Phone number added successfully.");
                } else {
                    System.out.println("Phone number already exists in the contact.");
                }
                break;
            }
        }
        if (!found) {
            PhoneBook newEntry = new PhoneBook(name, phone, newPhone);
            PhoneList.add(newEntry);
            System.out.println("Contact added successfully.");
        }
    }

    @Override
    public void removePhone(String name) {
        ArrayList<PhoneBook> toRemove = new ArrayList<>();
        for (PhoneBook i : PhoneList) {
            if (i.getName().equals(name)) {
                toRemove.add(i);
            }
        }
        if (toRemove.isEmpty()) {
            System.out.println("Not found!!!");
        } else {
            for (PhoneBook input : toRemove) {
                PhoneList.remove(input);
            }
            System.out.println("Deleted sucessfully!!!");
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        boolean found = false;
        for (PhoneBook i : PhoneList) {
            if (i.getName().equals(name)) {
                i.setNewPhone(newPhone);
                System.out.println("Updated successfully!!!");
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Not found!!!");
        }
    }

    @Override
    public void searchPhone(String name) {
        boolean found = false;
        for (PhoneBook i : PhoneList) {
            if (i.getName().equals(name)) {
                System.out.println("Phone number for: " + name + " - " + i.getPhone());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found!!!");
        }
    }

    @Override
    public void sort() {
        if (PhoneList.isEmpty()) {
            System.out.println("Cannot sort!!!");
        } else {
            PhoneList.sort((a, b) -> a.getName().compareTo(b.getName()));
            System.out.println("Sorted Ascending by name:");
            for (PhoneBook entry : PhoneList) {
                System.out.println(entry.getName() + ": " + entry.getPhone());
            }
        }
    }

}
