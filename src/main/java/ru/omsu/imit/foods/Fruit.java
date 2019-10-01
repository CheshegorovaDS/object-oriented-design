package ru.omsu.imit.foods;

public class Fruit implements Food{

    private int weight;
    private int time;

    public Fruit() {
    }

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        setTime(weight * 60);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
