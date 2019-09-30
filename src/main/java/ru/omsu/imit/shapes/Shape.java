package ru.omsu.imit.shapes;

import ru.omsu.imit.colors.Color;

public interface Shape {
    void paint(Color color);
    void changeColor(Color color);
    Color getColor();

}
