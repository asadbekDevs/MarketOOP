package model;

import java.util.Scanner;

public class OwnerService {

    Owner[] owners = new Owner[0];

    public boolean joinOwner() {

        Scanner scanner = new Scanner(System.in);
        Owner owner = new Owner();

        System.out.print("Enter name : ");
        owner.setName(scanner.next());

        boolean exists = false;

        for (Owner owner1 : owners) {
            if (owner.getName().equals(owner1.getName())) {
                System.out.println("User already exists!");
                exists=true;
            }
        }
        if (exists)
            return false;

        System.out.print("Enter password : ");
        owner.setPassword(scanner.next());

        System.out.print("Confirm password : ");
        if (scanner.next().equals(owner.getPassword())) {
            Owner[] temp = owners;
            owners = new Owner[temp.length + 1];
            System.arraycopy(temp, 0, owners, 0, temp.length);

            owners[temp.length] = owner;
        } else {
            System.out.println("Password did not match!");
        }

        return true;


    }

    public Owner ownerValidation() {

        Scanner scanner = new Scanner(System.in);
        Owner owner = new Owner();

        System.out.print("Enter username : ");
        owner.setName(scanner.next());

        System.out.print("Enter password : ");
        owner.setPassword(scanner.next());

        for (Owner owner1 : owners) {
            if (owner.getName().equals(owner1.getName())) {
                if (owner.getPassword().equals(owner1.getPassword())) {
                    return owner1;
                }
            }
        }

        return null;
    }

}
