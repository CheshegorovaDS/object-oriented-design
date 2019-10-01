package ru.omsu.imit.foods;

public class Meat implements Food{
    private int weight;
    private int time;

    public Meat() {
    }

    public Meat(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        setTime(weight * 120);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


}
