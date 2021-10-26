
import model.Owner;
import model.OwnerService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        OwnerService ownerService = new OwnerService();

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        boolean firstSepCode = true;

        while (firstSepCode) {
            System.out.println("1.Sign in.\n2.Sign up.\n0.Exit");
            switch (scannerInt.nextInt()) {

                case 1: {
                    Owner owner = ownerService.ownerValidation();
                    if (owner!=null) {

                        boolean secondStepCode = false;
                        while (!secondStepCode) {
                            System.out.println("1.Show Debtors list.\n2.Add new Debtor.\n3.Add Amount.\n4.Reduce Amount.\n5.Get Debtor History.\n0.Exit.");
                            switch (scannerInt.nextInt()) {
                                case 1: {
                                    owner.showDebtbook();
                                    break;
                                }
                                case 2: {
                                    owner.addNewDebtor();
                                    break;
                                }
                                case 3: {
                                    owner.addAmount();
                                    break;
                                }
                                case 4: {
                                    owner.returnAmount();
                                    break;
                                }
                                case 5: {
                                    owner.showHistory();
                                    break;
                                }
                                case 0: {
                                    secondStepCode = true;
                                    break;
                                }
                                default: {
                                    System.out.println("Wrong option!");
                                }
                            }
                        }

                    } else {
                        System.out.println("User not found");
                    }
                    break;
                }
                case 2: {
                    ownerService.joinOwner();
                    break;
                }
                case 0: {
                    firstSepCode = false;
                    break;
                }
                default: {
                    System.out.println("Wrong option");
                    break;
                }
            }
        }

        String _catDog_3 = "a";


    }

}
