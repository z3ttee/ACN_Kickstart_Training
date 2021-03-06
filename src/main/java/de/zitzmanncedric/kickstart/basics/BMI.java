package de.zitzmanncedric.kickstart.basics;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * THE PROBLEM
 *
 * Write a program that calculates and displays a person's
 * body mass index (BMI). A person's BMI is calculated with
 * the following formula:
 *
 * BMI = weight / height ^ 2.
 *
 * Where weight is measured in kg and height is measured
 * in cm. Display a message indicating whether the person
 * has optimal weight, is underweight, or is overweight.
 * A sedentary person's weight is considered optimal if
 * his or her BMI is between 18.5 and 25. If the BMI is less
 * than 18.5, the person is considered underweight. If the
 * BMI value is greater than 25, the person is considered
 * overweight.
 */
public class BMI {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your height in cm:");
            double height = (double) Integer.parseInt(scanner.nextLine()) / 100;

            System.out.println("Please enter your weight in kg (e.g.: 70.5):");
            double weight = Double.parseDouble(scanner.nextLine());

            // BMI = weight x 703 / height ^ 2.
            double bmi = (weight) / (height * height);

            NumberFormat format = NumberFormat.getInstance();
            format.setMaximumFractionDigits(2);
            format.setMinimumFractionDigits(2);

            if (bmi < 18.5) {
                System.out.println("Your BMI is " + format.format(bmi) + ". Untergewicht");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                System.out.println("Your BMI is " + format.format(bmi) + ". Normalgewicht");
            } else if (bmi >= 25) {
                System.out.println("Your BMI is " + format.format(bmi) + ". Übergewicht");
            }
        } catch (NumberFormatException | InputMismatchException ex) {
            System.out.println("You have to enter a valid number!");
        }
    }

}
