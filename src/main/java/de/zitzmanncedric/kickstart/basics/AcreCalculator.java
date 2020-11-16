package de.zitzmanncedric.kickstart.basics;

/**
 * THE PROBLEM
 *
 * One acre of land is equivalent to 43,560 square feet.
 * Write a program that calculates the number of acres
 * in a tract of land with 389,767 square feet.
 * (Use Constants)
 */

public class AcreCalculator {
    // Define given constants
    static final double acreInSqFeet = 43.560;
    static final double givenSqFeet = 389.767;

    public static void main(String[] args) {
        // Calculate amount of acres
        final double amountOfAcres = givenSqFeet/acreInSqFeet;

        // Print to output
        System.out.println(givenSqFeet+" SqFeet are equal to "+amountOfAcres+" acres.");
    }
}
