package ru.omsu.imit.microwaves;

import ru.omsu.imit.foods.Food;

public class MicrowaveSony implements MicrowaveOven{
    private Food food;
    private int power = 1;

    public MicrowaveSony() {
    }

    public MicrowaveSony(Food food) {
        this.food = food;
    }

    public void power(int time) {
    }

    public void powerDefrost() {
        if(food.getWeight()>0){
            power(food.getTime());
        }
    }

    public void weighAdd() {
        food.setWeight(food.getWeight()+100);
    }

    public void reset() {
        food.setTime(0);
        food.setWeight(0);
    }
}
