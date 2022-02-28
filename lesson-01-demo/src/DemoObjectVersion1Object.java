import processing.core.PApplet;

public class DemoObjectVersion1Object extends PApplet {
    Button button = new Button();
    Button b2 = new Button();

    @Override
    public void settings() {

        size(600, 600);
        button.x = 100;
        button.y = 50;
        button.width = 100;
        button.height = 50;

        b2.x = 400;
        b2.y = 400;
        b2.width = 50;
        b2.height = 50;
    }

    @Override
    public void draw() {
        background(0);
        button.dessine();
        b2.dessine();
    }

    @Override
    public void mouseReleased() {
        button.changeColor();
        b2.changeColor();
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"DemoObject"}, new DemoObjectVersion1Object());
    }

    class Button {
        int width;
        int height;
        int x;
        int y;
        boolean isYellow = true;

        void dessine() {
            if (x <= mouseX && mouseX <= (x + width) && y <= mouseY && mouseY <= (y + height)) {
                if (isYellow) fill(255, 255, 0);
                else fill(255, 0, 255);
            } else {
                if (isYellow) fill(180, 180, 0);
                else fill(180, 0, 180);
            }
            rect(x, y, width, height);
        }

        void changeColor() {
            isYellow = ! isYellow;
        }
    }
}
