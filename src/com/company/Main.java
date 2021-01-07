package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        menu();
        while (!valid) {

            System.out.print("Enter Choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    menu();
                    break;
                case 1:
                    new Permutation();
                    break;
                case 2:
                    new Combination();
                    break;
                case 3:
                    System.out.println("Exited from Application");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }

    static void menu() {
        System.out.println("0:Reprint Menu");
        System.out.println("1:Permutation");
        System.out.println("2:Combination");
        System.out.println("3:Exit");
    }
}
