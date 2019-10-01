package ru.omsu.imit;

import ru.omsu.imit.foods.*;
import ru.omsu.imit.microwaves.*;

public class Demo {

    public static void main(String[] args) {
        MicrowaveSony sony = new MicrowaveSony(new Meat());
        sony.weighAdd();
        sony.weighAdd();
        sony.powerDefrost();

        MicrowaveSamsung samsung = new MicrowaveSamsung(new Fruit());
        samsung.powerDefrost();
    }

}
