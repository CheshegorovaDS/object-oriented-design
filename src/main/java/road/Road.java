package road;

import pillars.Pillar;
import pillars.PillarFactory;
import pillars.PillarType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

// Классы Pillar и Road являются клиентами Легковеса.

public class Road extends JFrame {
    private List<Pillar> pillars = new ArrayList<>();

    public void drawPillars(int x, int y, String name, Color color, String otherPillarData) {
        PillarType type = PillarFactory.getPillarType(name, color, otherPillarData);
        Pillar pillar = new Pillar(x, y, type);
        pillars.add(pillar);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Pillar pillar : pillars) {
            pillar.draw(graphics);
        }
    }
}
