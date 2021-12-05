import processing.core.PApplet;

import java.util.ArrayList;

public class Demo4RectangleNoOverlap extends PApplet {
    RectangleOverList rectangleOvers = new RectangleOverList();

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {
        surface.setTitle("Demo 4 - rectangle mouse over no overlap");
    }

    @Override
    public void draw() {
        background(50, 0, 50);
        rectangleOvers.draw(mouseX, mouseY);
    }

    @Override
    public void mouseReleased() {
        rectangleOvers.add(mouseX, mouseY);
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"demo 4"}, new Demo4RectangleNoOverlap());
    }

    class RectangleOverList {
        ArrayList<RectangleOver> list = new ArrayList<>();

        void add(int x, int y) {
            RectangleOver candidate = new RectangleOver(x, y);
            for (RectangleOver r : list) {
                if (r.isOver(candidate)) {
                    list.remove(r);
                }
            }
            list.add(new RectangleOver(x, y));
        }

        void draw(int x, int y) {
            for (RectangleOver r : list) r.draw(x, y);
        }
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

        private boolean isOver(RectangleOver other) {
            return isOver(other.x, other.y)
                    || isOver(other.x + width, other.y)
                    || isOver(other.x, other.y + height)
                    || isOver(other.x + width, other.y + height);
        }
    }
}
