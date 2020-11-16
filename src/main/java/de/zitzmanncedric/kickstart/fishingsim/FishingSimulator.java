package de.zitzmanncedric.kickstart.fishingsim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FishingSimulator {

    private static final HashMap<Integer, FishingOutCome> outComeHashMap = new HashMap<>();
    private static int totalPoints = 0;

    public static void main(String[] args) {
        setupGame();

        Scanner keyboard = new Scanner(System.in);
        String continuePlay;

        do {
            Dice dice = new Dice(outComeHashMap.size());
            dice.roll();

            FishingOutCome outCome = outComeHashMap.get(dice.getValue());
            totalPoints += outCome.getPoints();

            System.out.println("You caught something!");
            System.out.println(">> You fished: "+outCome.getFishName());
            System.out.println(">> Received points: "+outCome.getPoints());
            System.out.println("\nDo you want to continue playing? (y/N):");

            continuePlay = keyboard.nextLine();
        } while (continuePlay.equalsIgnoreCase("y"));

        System.out.println("[]================[ Fishing session over ]================[]");
        System.out.println("\nLet's look what score you've reached:\n");
        System.out.println(totalPoints+" TOTAL POINTS!\n");

        if(totalPoints < 0) {
            System.out.println("Well, it seems like you need some more training!");
        } else if (totalPoints > 0 && totalPoints < 50) {
            System.out.println("You did well, but it can always be better!");
        } else {
            System.out.println("Now get the giant grill party started!");
        }

        System.out.println("\n[]========================================================[]");
        keyboard.close();
    }

    private static void setupGame() {
        outComeHashMap.put(1, new FishingOutCome("Clownfish", 10));
        outComeHashMap.put(2, new FishingOutCome("Shoe", -10));
        outComeHashMap.put(3, new FishingOutCome("Umbrella", -5));
        outComeHashMap.put(4, new FishingOutCome("Trout", 15));
        outComeHashMap.put(5, new FishingOutCome("Anchovy", 3));
        outComeHashMap.put(6, new FishingOutCome("Salmon", 22));
    }

}
