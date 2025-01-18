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
                    break;

                case 'D':
                    System.out.print("\nEnter amount to Deposit: ");
                    String initDepo = scanner.nextLine();

                    try {
                        depo = Integer.parseInt(initDepo);

                        if (depo <= 0) {
                            System.out.println("\nDeposit Amount must be greater than 0\n");
                        } else if (depo <= 500000) {
                            bal += depo; // bal = bal + depo
                            System.out.println("\nDeposit Transaction is successfully completed.\n");
                        } else {
                            System.out.println("\nDeposit Amount must not be greater than 500,000\n");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("\nInvalid entry. Please enter a valid number.\n");
                    }

                    break;

                case 'W':
                    System.out.print("\nEnter amount to Withdraw: ");
                    String initWithdraw = scanner.nextLine();

                    try {
                        withdraw = Integer.parseInt(initWithdraw);

                        if (withdraw <= 0) {
                            System.out.println("\nWithdrawal Amount must be greater than zero\n");
                        } else if (withdraw > bal) {
                            System.out.println("\nWithdrawal Amount must not be greater than " + bal + "\n");
                        } else if (!(withdraw % 100 == 0)) {
                            System.out.println("\nWithdrawal Amount must be exactly divisible by 100\n");
                        } else {
                            bal -= withdraw; // bal = bal - withdraw
                            System.out.println("\nWithdrawal Transaction is successfully completed.\n");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("\nInvalid entry. Please enter a valid number.\n");
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

            if (option == 'Q') {
                System.out.println("\nThank you for using the program!");
                scanner.close();
                return;
            }

            System.out.print("Want to Transact Another (Y/N)? ");
            char transactOpt;
            while (true) {
                transactOpt = Character.toUpperCase(scanner.nextLine().charAt(0));

                if (!(transactOpt == 'Y' || transactOpt == 'N')) {
                    System.out.print("\nInvalid entry, enter Y/N only: ");
                    continue;
                } else {
                    break;
                }
            }

            if (transactOpt == 'Y') {
                System.out.println();
                continue;
            }

            System.out.println("\nThank you for using the program!");
            scanner.close();
            return;

        }
    }
}