import processing.core.PApplet;

public class DemoCheckBox extends PApplet {
    CheckBox checkBox1 = new CheckBox(true, "option 1", 40, 40, 25);
    CheckBox checkBox2 = new CheckBox(false, "option 2", 40, 80, 25);
    CheckBox checkBox3 = new CheckBox(false, "option 3", 40, 120, 25);
    CheckBox checkBox4 = new CheckBox(true, "option 4", 40, 160, 25);


    @Override
    public void settings() {
        size(300, 200);
    }

    @Override
    public void draw() {
        background(240);
        checkBox1.draw();
        checkBox2.draw();
        checkBox3.draw();
        checkBox4.draw();
    }

    @Override
    public void mousePressed() {
        checkBox1.mousePressed();
        checkBox2.mousePressed();
        checkBox3.mousePressed();
        checkBox4.mousePressed();
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[] { "CheckBox" }, new DemoCheckBox());
    }

    class CheckBox {
        boolean isSelected;
        String label;
        int x;
        int y;
        int size;

        public CheckBox(boolean isSelected, String label, int x, int y, int size) {
            this.isSelected = isSelected;
            this.label = label;
            this.x = x;
            this.y = y;
            this.size = size;
        }

        public void draw() {
            // dessine le carré
            rectMode(CENTER);
            stroke(0);
            if (isSelected) {
                fill(0, 201, 191);
            } else {
                noFill();
            }
            square(x, y, size);
            // dessine le V
            fill(0);
            if (isSelected) {
                textAlign(CENTER, CENTER);
                textSize(size);
                text("V", x, y - size * 0.15f);
            }
            // dessine le label
            textSize(size);
            textAlign(LEFT, CENTER);
            text(label, x + size, y - size * 0.15f);
        }

        public void mousePressed() {
            if (isMouseIn()) {
                isSelected = ! isSelected;
            }
        }

        public boolean isMouseIn() {
            return Math.abs(mouseX - x) <= size / 2 && Math.abs(mouseY - y) <= size / 2;
        }
    }
}
