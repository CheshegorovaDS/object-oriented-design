package pillars;

import java.awt.*;

// Контекстный объект, из которого мы выделили легковес
// PillarType. В программе могут быть тысячи объектов Pillar, так
// как накладные расходы на их хранение совсем небольшие — в
// памяти нужно держать всего три целых числа (две координаты и
// ссылка).
public class Pillar {
    private int x;
    private int y;
    private PillarType type;

    public Pillar(int x, int y, PillarType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics graphics){
        type.draw(graphics,x,y);
    }
}
