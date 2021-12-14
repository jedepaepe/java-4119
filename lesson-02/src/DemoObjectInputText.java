import processing.core.PApplet;

public class DemoObjectInputText extends PApplet {
    InputText inputText = new InputText(100, 100, 500, color(0, 0, 255));
    InputText inputText2 = new InputText(100, 200, 500, color(255, 0, 255));

    @Override
    public void settings() {
        size(800, 500);
    }

    @Override
    public void draw() {
        background(255);
        inputText.draw();
        inputText2.draw();
    }

    @Override
    public void keyPressed() {
        inputText.keyPressed();
        inputText2.keyPressed();
    }


    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"Demo"}, new DemoObjectInputText());
    }

    class InputText {
        String text = "";
        int width;
        int x;
        int y;
        int fontColor;

        public InputText(int x, int y, int width, int fontColor) {
            this.width = width;
            this.x = x;
            this.y = y;
            this.fontColor = fontColor;
        }

        public void draw() {
            fill(255);
            rect(x - 10, y - 35, width, 50);
            fill(fontColor);
            textSize(32);
            text(text, x, y);
        }

        public void keyPressed() {
            text += key;
        }
    }

}
