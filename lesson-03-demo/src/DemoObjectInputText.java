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

    @Override
    public void mousePressed() {
        inputText.mousePressed();
        inputText2.mousePressed();
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
        boolean hasFocus = false;

        public InputText(int x, int y, int width, int fontColor) {
            this.width = width;
            this.x = x;
            this.y = y;
            this.fontColor = fontColor;
        }

        public void draw() {
            if (hasFocus) stroke(0, 255, 0);
            else stroke(0);
            fill(255);
            rect(x, y, width, 50);
            fill(fontColor);
            textSize(32);
            text(text, x + 10, y + 35);
        }

        public void keyPressed() {
            if (hasFocus) {
                text += key;
            }
        }

        public void mousePressed() {
            hasFocus = isMouseIn();
        }

        /**
         * indique si la souri est dans le :InputText
         * @return true si la souri est dans le :InputText, false dans le cas contraire
         */
        public boolean isMouseIn() {
            return x <= mouseX && mouseX <= (x + width) && y <= mouseY && mouseY <= (y + 50);
        }
    }

}
