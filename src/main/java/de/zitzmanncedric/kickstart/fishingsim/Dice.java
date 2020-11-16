package de.zitzmanncedric.kickstart.fishingsim;

import java.util.Random;

public class Dice {

    private final int sides;
    private int value = 0;

    public Dice(int sides) {
        this.sides = sides;
    }

    public void roll() {
        this.value = new Random().nextInt(sides)+1;
    }

    public int getValue() {
        return value;
    }
}
