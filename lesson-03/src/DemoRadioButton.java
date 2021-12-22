import processing.core.PApplet;

public class DemoRadioButton extends PApplet {
    RadioButton radioButton1 = new RadioButton(true, "option 1", 20, 40, 15);
    RadioButton radioButton2 = new RadioButton(false, "option 2", 20, 80, 15);
    RadioButton radioButton3 = new RadioButton(false, "option 3", 20, 120, 15);
    RadioButton radioButton4 = new RadioButton(true, "option 4", 20, 160, 15);


    @Override
    public void settings() {
        size(300, 200);
    }

    @Override
    public void draw() {
        background(255);
        radioButton1.draw();
        radioButton2.draw();
        radioButton3.draw();
        radioButton4.draw();
    }

    @Override
    public void mousePressed() {
        radioButton1.mousePressed();
        radioButton2.mousePressed();
        radioButton3.mousePressed();
        radioButton4.mousePressed();
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[] { "RadioButton" }, new DemoRadioButton());
    }

    class RadioButton {
        boolean isSelected = false;
        String label;
        int x;
        int y;
        int diameter;

        public RadioButton(boolean isSelected, String label, int x, int y, int diameter) {
            this.isSelected = isSelected;
            this.label = label;
            this.x = x;
            this.y = y;
            this.diameter = diameter;
        }

        public void draw() {
            noFill();
            stroke(0, 0, 255);
            circle(x, y, diameter);
            fill(0, 0, 255);
            textSize(20);
            text(label, x + diameter, y + diameter / 2);
            if (isSelected) {
                circle(x, y, diameter * 0.6f);
            }
        }

        public void mousePressed() {
            if (isMouseIn()) {
                isSelected = ! isSelected;
            }
        }

        public boolean isMouseIn() {
            int deltaX = mouseX - x;
            int deltaY = mouseY - y;
            return Math.sqrt(deltaX * deltaX + deltaY * deltaY) <= diameter / 2;
        }
    }
}
