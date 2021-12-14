import processing.core.PApplet;

public class DemoInputText extends PApplet {
    String inputText = "";

    @Override
    public void settings() {
        size(800, 500);
    }

    @Override
    public void draw() {
        background(255);
        noFill();
        rect(90, 65, 500, 50);
        fill(0);
        textSize(32);
        text(inputText, 100, 100);
    }

    @Override
    public void keyPressed() {
        inputText += key;
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"Demo"}, new DemoInputText());
    }
}
