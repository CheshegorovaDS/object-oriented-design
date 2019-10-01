package ru.omsu.imit.microwaves;

public interface MicrowaveOven {
    public void power(int time);
    public void powerDefrost();
    public void weighAdd();
    public void reset();
}
