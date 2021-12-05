import processing.core.PApplet;

public class Demo2RectangleOverClass extends PApplet {
    RectangleOver rectangleOver = new RectangleOver();

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {
        surface.setTitle("Demo 2 - rectangle mouse over class");
    }

    @Override
    public void draw() {
        background(50, 0, 50);
        rectangleOver.draw(mouseX, mouseY);
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"demo 2"}, new Demo2RectangleOverClass());
    }

    class RectangleOver {
        int x = 100;
        int y = 100;
        int width = 100;
        int height = 50;

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
