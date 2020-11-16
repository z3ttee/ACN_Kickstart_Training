package de.zitzmanncedric.kickstart.fishingsim;

public class FishingOutCome {

    private String fishName;
    private int points;

    public FishingOutCome(String fishName, int points){
        this.fishName = fishName;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getFishName() {
        return fishName;
    }
}
