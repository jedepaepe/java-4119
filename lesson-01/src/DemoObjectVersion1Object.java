import processing.core.PApplet;

public class DemoObjectVersion1Object extends PApplet {
    Button button = new Button(100, 50, 100, 50);
    Button b2 = new Button(50, 50, 400, 400);

    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void draw() {
        System.out.println(width);
        background(0);
        button.draw();
        b2.draw();
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"DemoObject"}, new DemoObjectVersion1Object());
    }

    class Button {
        int width;
        int height;
        int x;
        int y;

        Button(int pwidth, int pheight, int px, int py) {
            width = pwidth;
            height = pheight;
            x = px;
            y = py;
        }

        void draw() {
            if (x <= mouseX && mouseX <= (x + width) && y <= mouseY && mouseY <= (y + height)) {
                fill(255, 255, 0);
            } else {
                fill(180, 180, 0);
            }
            rect(x, y, width, height);
        }
    }
}
