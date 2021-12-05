import processing.core.PApplet;

import java.util.ArrayList;

public class Demo3RectangleOverList extends PApplet {
    ArrayList<RectangleOver> rectangleOvers = new ArrayList<>();

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
        for (RectangleOver rectangleOver : rectangleOvers) rectangleOver.draw(mouseX, mouseY);
    }

    @Override
    public void mouseReleased() {
        rectangleOvers.add(new RectangleOver(mouseX, mouseY));
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"demo 3"}, new Demo3RectangleOverList());
    }

    class RectangleOver {
        int x;
        int y;;
        int width = 100;
        int height = 50;

        RectangleOver(int x, int y) {
            this.x = x;
            this.y = y;
        }

        void draw(int mouseX, int mouseY) {
            if (isOver(mouseX, mouseY)) {
                fill(200, 200, 0);
            } else {
                fill(255, 255, 0);
            }
            rect(x, y, width, height);
        }

        private boolean isOver(int mouseX, int mouseY) {
            return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
        }
    }
}
