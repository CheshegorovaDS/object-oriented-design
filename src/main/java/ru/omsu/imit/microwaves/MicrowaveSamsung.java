package ru.omsu.imit.microwaves;

import ru.omsu.imit.foods.Food;

public class MicrowaveSamsung {
    private Food food;
    private int power = 2;

    public MicrowaveSamsung() {
    }

    public MicrowaveSamsung(Food food) {
        this.food = food;
    }

    public void power(int time) {
    }

    public void powerDefrost() {
        if(food.getWeight()>0){
            power(food.getTime()*2);
        }
    }

    public void weighAdd() {
        food.setWeight(food.getWeight()+100);
    }

    public void reset() {
        food.setWeight(100);
    }

}
