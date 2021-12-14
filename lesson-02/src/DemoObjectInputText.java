import processing.core.PApplet;

public class DemoObjectInputText extends PApplet {
    InputText inputText = new InputText();

    @Override
    public void settings() {
        size(800, 500);
    }

    @Override
    public void draw() {
        background(255);
        inputText.draw();
    }

    @Override
    public void keyPressed() {
        inputText.keyPressed();
    }


    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"Demo"}, new DemoObjectInputText());
    }

    class InputText {
        String text = "";

        public void draw() {
            fill(255);
            rect(90, 65, 500, 50);
            fill(0);
            textSize(32);
            text(text, 100, 100);
        }

        public void keyPressed() {
            text += key;
        }
    }
}
