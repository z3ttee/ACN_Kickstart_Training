package de.zitzmanncedric.kickstart;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * THE PROBLEM:
 *
 * An electronics company sells circuit boards at a 40 percent profit,
 * If you know the retail price of a circuit board, you can calculate
 * its profit with the following formula:
 *
 * Profit = Retail price x 0.4
 *
 * Write a program that asks the user for the retail price of a circuit
 * board calculates the amount of profit earned for that product, and
 * displays the result on the screen.
 */

public class ProfitCalculator {
    static final double profitPercentage = 0.4;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the retail price for one circuit board:");
            int retailPrice = scanner.nextInt();

            if (retailPrice < 0) {
                System.out.println("You can not have a negative retail price!");
                return;
            }

            double totalProfit = retailPrice * profitPercentage;
            System.out.println("Profit earned for that product: " + totalProfit);
        } catch (NumberFormatException | InputMismatchException ex) {
            System.out.println("You have to enter a valid number!");
        }
    }

}
