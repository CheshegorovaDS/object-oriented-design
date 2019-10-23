package pillars;

import java.awt.*;

//класс-легковес

public class PillarType {
    private String name;
    private Color color;
    private String otherPillarData;

    public PillarType(String name, Color color, String otherPillarData) {
        this.name = name;
        this.color = color;
        this.otherPillarData = otherPillarData;
    }

    public void draw(Graphics graphics, int x, int y){
        graphics.setColor(Color.GRAY);
        graphics.fillRoundRect(x-1,y,1,2,1,1);
        graphics.setColor(color);
        graphics.fillRect(x+1,y+1,1,1);
    }
}
