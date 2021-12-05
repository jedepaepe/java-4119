package exercice5;

import java.util.ArrayList;
import java.util.List;
import processing.core.PApplet;

public class Demo5RectangleOverRule extends PApplet {
    List<RectangleOver> rectangleOvers = new ArrayList<>();

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {
        surface.setTitle("Demo 3 - rectangle mouse over list");
    }

    @Override
    public void draw() {
        background(50, 0, 50);
        for (RectangleOver rectangleOver : rectangleOvers) rectangleOver.draw(this, mouseX, mouseY);
    }

    @Override
    public void mouseReleased() {
        if (OverRule.canAdd(rectangleOvers, mouseX, mouseY)) {
            rectangleOvers.add(new RectangleOver(mouseX, mouseY));
        }
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"demo 3"}, new Demo5RectangleOverRule());
    }
}
