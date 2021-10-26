package model;

import java.util.Scanner;

public class Owner {


    private String name;
    private String password;
    private DebtBook detBook = new DebtBook();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addNewDebtor() {

        Debtor debtor = new Debtor();

        System.out.print("Enter Debtors name : ");
        debtor.setName(new Scanner(System.in).next());

        System.out.println("Enter amount : ");
        debtor.setAmount(new Scanner(System.in).nextDouble());

        if (detBook.searchDebtor(debtor.getName()) != null) {
            System.out.println("User already exists!");
        } else {
            detBook.addDebtor(debtor);
        }

    }

    public void addAmount() {


        System.out.print("Enter Debtors name : ");
        String name = new Scanner(System.in).next();

        System.out.println("Enter amount : ");
        double amount = new Scanner(System.in).nextDouble();

        Debtor debtor = detBook.searchDebtor(name);

        if (debtor == null) {
            System.out.println("User not found!");
        } else {
            debtor.addAmount(amount);
        }

    }

    public void returnAmount() {


        System.out.print("Enter Debtors name : ");
        String name = new Scanner(System.in).next();

        System.out.println("Enter amount : ");
        double amount = new Scanner(System.in).nextDouble();

        Debtor debtor = detBook.searchDebtor(name);

        if (debtor == null) {
            System.out.println("User not found!");
        } else {
            debtor.returnAmount(amount);
        }

    }

    public void showDebtbook() {
        detBook.getDebtor();
    }

    public void showHistory() {

        Debtor debtor = detBook.searchDebtor(new Scanner(System.in).next());

        if (debtor == null) {
            System.out.println("User not found!");
        } else {
            debtor.getHistory();
        }

    }
}
