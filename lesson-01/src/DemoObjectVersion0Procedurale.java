import processing.core.PApplet;

public class DemoObjectVersion0Procedurale extends PApplet {
    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void draw() {
        background(0);
        //
        //   50-----x-----150/100
        //   |               |
        //   |               y
        //   |               |
        //   -------------- 150
        //
        if (50 <= mouseX && mouseX <= 150 && 100 <= mouseY && mouseY <= 150) {
            fill(255, 255, 0);
        } else {
            fill(180, 180, 0);
        }
        rect(50, 100, 100, 50);
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"DemoObject"}, new DemoObjectVersion0Procedurale());
    }
}
