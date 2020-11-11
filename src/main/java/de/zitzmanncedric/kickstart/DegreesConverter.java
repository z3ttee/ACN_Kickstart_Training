package de.zitzmanncedric.kickstart;

/**
 * THE PROBLEM
 *
 * The formula for converting celsius temperature
 * to fahrenheit is °C x 9/5 + 32 = °F. Write a
 * program that displays temps up to 100 degrees
 * fahrenheit.
 */
public class DegreesConverter {

    public static void main(String[] args) {
        // °C x 9/5 + 32 = °F

        for(int i = 0; i<=100; i++) {
            double convertedToF = (i * 9d) / 5d + 32d;
            System.out.println(i+"°C => "+convertedToF+"°F");
        }
    }

}
