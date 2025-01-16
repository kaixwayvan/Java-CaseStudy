import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bal = 100000, depo = 0, withdraw = 0;

        System.out.println("\nWelcome to ABC BANK\n");
        System.out.println("B - Check for balance");
        System.out.println("D - Make deposit");
        System.out.println("W - Make withdrawal");
        System.out.println("Q - Quit\n");

        while (true) {
            System.out.print("Select an option: ");
            char option = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch (option) {
                case 'B':
                    System.out.println("\nYour current balance is " + bal + "\n");

                    System.out.print("Want to Transact Another (Y/N)? ");
                    char transactOptB;
                    while (true) {
                        transactOptB = Character.toUpperCase(scanner.nextLine().charAt(0));

                        if (!(transactOptB == 'Y' || transactOptB == 'N')) {
                            System.out.print("\nInvalid entry, enter Y/N only: ");
                            continue;
                        } else {
                            break;
                        }
                    }

                    if (transactOptB == 'Y') {
                        System.out.println();
                        continue;
                    }

                    break;

                case 'D':
                    System.out.print("\nEnter amount to Deposit: ");
                    depo = Integer.valueOf(scanner.nextLine());

                    if (depo <= 0) {
                        System.out.println("\nDeposit Amount must be greater than 0");
                    } else if (depo <= 500000) {
                        bal += depo;
                        System.out.println("\nDeposit Amount is successfully completed.");
                    } else {
                        System.out.println("\nDeposit Amount must not be greater than 500,000");
                    }

                    System.out.print("Want to Transact Another (Y/N)? ");
                    char transactOptD;
                    while (true) {
                        transactOptD = Character.toUpperCase(scanner.nextLine().charAt(0));

                        if (!(transactOptD == 'Y' || transactOptD == 'N')) {
                            System.out.print("\nInvalid entry, enter Y/N only: ");
                            continue;
                        } else {
                            break;
                        }
                    }

                    if (transactOptD == 'Y') {
                        System.out.println();
                        continue;
                    }

                    break;

                case 'W':
                    System.out.print("\nEnter amount to Withdraw: ");
                    withdraw = Integer.valueOf(scanner.nextLine());

                    if (withdraw <= 0) {
                        System.out.println("\nWithdrawal Amount must be greater than zero");
                    } else if (withdraw > bal) {
                        System.out.println("\nWithdrawal Amount must not be greater than " + bal);
                    } else if (!(withdraw%100==0)) {
                        System.out.println("\nWithdrawal Amount must be exactly divisible by 100");
                    } else {
                        bal -= withdraw;
                        System.out.println("\nWithdrawal Transaction is successfully completed.");
                    }

                    System.out.print("Want to Transact Another (Y/N)? ");
                    char transactOptW;
                    while (true) {
                        transactOptW = Character.toUpperCase(scanner.nextLine().charAt(0));

                        if (!(transactOptW == 'Y' || transactOptW == 'N')) {
                            System.out.print("\nInvalid entry, enter Y/N only: ");
                            continue;
                        } else {
                            break;
                        }
                    }

                    if (transactOptW == 'Y') {
                        System.out.println();
                        continue;
                    }

                    break;
                case 'Q':
                    System.out.print("\nDo you really want to terminate this program (Y/N)? ");

                    char quitOpt;
                    while (true) {
                        quitOpt = Character.toUpperCase(scanner.nextLine().charAt(0));

                        if (!(quitOpt == 'Y' || quitOpt == 'N')) {
                            System.out.print("\nInvalid entry, enter Y/N only: ");
                            continue;
                        } else {
                            break;
                        }
                    }

                    if (quitOpt == 'N') {
                        System.out.println();
                        continue;
                    }

                    break;

                default:
                    System.out.println("\nInvalid entry, enter any valid option: B/D/W/Q\n");
                    continue;
            }

            System.out.println("\nThank you for using the program!");
            scanner.close();
            return;

        }
    }
}