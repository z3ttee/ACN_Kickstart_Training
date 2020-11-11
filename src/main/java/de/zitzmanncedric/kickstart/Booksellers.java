package de.zitzmanncedric.kickstart;

import java.util.Scanner;

/**
 * THE PROBLEM
 *
 * Serendipity Booksellers has a book club that awards points to
 * its customers based on the number of books purchased each month.
 * The points are awarded as follows:
 *
 * - If a customer purchases 0 books, he or she earns 0 points.
 * - If a customer purchases 1 book, he or she earns 5 points.
 * - If a customer purchases 2 books, he or she earns 15 points.
 * - If a customer purchases 3 books, he or she earns 30 points.
 * - If a customer purchases 4 or more books, he or she earns 60 points.
 *
 * Write a program that asks the user to enter the number of books
 * that he or she has purchased this month and displays the number
 * of points awarded.
 */

public class Booksellers {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the amount of books you've bought:");
            int books = scanner.nextInt();
            int bonusPoints = 0;

            if (books < 1) {
                System.out.println("You must have bought one book at least to receive bonus points");
                return;
            }

            bonusPoints = switch (books) {
                case 1 -> 5;
                case 2 -> 15;
                case 3 -> 30;
                default -> 60;
            };

            System.out.println("By buying " + books + " books, you received " + bonusPoints + " bonus points.");
        } catch (NumberFormatException ex) {
            System.out.println("You have to enter a valid number!");
        }
    }

}

