import processing.core.PApplet;

public class Demo1RectangleOver extends PApplet {

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {
        surface.setTitle("Demo 1 - rectangle mouse over");
    }

    @Override
    public void draw() {
        background(50, 0, 50);
        int rectX = 100;
        int rectY = 100;
        int rectWidth = 100;
        int rectHeight = 60;
        if (mouseX >= rectX && mouseX <= rectX + rectWidth && mouseY >= rectY && mouseY <= rectY + rectHeight) {
            fill(200, 200, 0);
        } else {
            fill(255, 255, 0);
        }
        rect(rectX, rectY, rectWidth, rectHeight);
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"demo 1"}, new Demo1RectangleOver());
    }
}
