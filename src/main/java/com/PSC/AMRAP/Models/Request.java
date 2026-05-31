package main.java.com.PSC.AMRAP.Models;

public class Request {
    public int sets;
    public int percentage;
    public int maxWeight;

    public Request(int sets, int percentage, int maxWeight) {
        this.sets = sets;
        this.percentage = percentage;
        this.maxWeight = maxWeight;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
