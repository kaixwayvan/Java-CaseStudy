//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");

        int bal = 100000, depo = 0, withdraw = 0;

        System.out.println("Welcome to ABC BANK\n");
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
                    char transactOpt = Character.toUpperCase(scanner.nextLine().charAt(0));

                    if (transactOpt == 'Y') {
                        System.out.println();
                        continue;
                    } else if (transactOpt == 'N') {
                        break;
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

                    System.out.print("\nWant to Transact Another (Y/N)? ");
                    char transactOpt1 = Character.toUpperCase(scanner.nextLine().charAt(0));

                    if (transactOpt1 == 'Y') {
                        System.out.println();
                        continue;
                    } else if (transactOpt1 == 'N') {
                        break;
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
                    }

                    System.out.print("\nWant to Transact Another (Y/N)? ");
                    char transactOpt2 = Character.toUpperCase(scanner.nextLine().charAt(0));

                    if (transactOpt2 == 'Y') {
                        System.out.println();
                        continue;
                    } else if (transactOpt2 == 'N') {
                        break;
                    }

                    break;
                case 'Q':
                    System.out.print("\nDo you really want to terminate this program (Y/N)? ");
                    char quitOpt = Character.toUpperCase(scanner.nextLine().charAt(0));

                    if (quitOpt == 'Y') {
                        break;
                    } else if (quitOpt == 'N') {
                        System.out.println();
                        continue;
                    }

                    break;
                default:
                    System.out.println("\nInvalid entry, enter any valid option: B/D/W/Q\n");
                    continue;
            }

            System.out.println("\nThank you for using the program!");
            break;

        }
    }
}