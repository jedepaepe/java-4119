import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class DemoRadioButton extends PApplet {
    RadioButtonsGroup group = new RadioButtonsGroup(new String[]{"option 1", "option 2", "option 3", "option 4"}, 0, 40, 40, 25);

    @Override
    public void settings() {
        size(300, 200);
    }

    @Override
    public void draw() {
        background(240);
        group.draw();
    }

    @Override
    public void mousePressed() {
        group.mousePressed();
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[] {"RadioButton"}, new DemoRadioButton());
    }

    class RadioButtonsGroup {
        RadioButton[] radioButtons;

        /**
         * constructeur de la classe RadioButtonsGroup
         * @param labels est la liste tous les labels que nous voulons afficher
         * @param selected est l'index du label qui sélectionné
         * @param x est la position x du centre du cercle du premier :RadioButton
         * @param y est la position y du centre du cercle du premier :RadioButton
         * @param diameter est le diamètre des :RadioButton
         */
        public RadioButtonsGroup(String[] labels, int selected, int x, int y, int diameter) {
            radioButtons = new RadioButton[labels.length];
            for (int i = 0; i < radioButtons.length; ++i) {
                radioButtons[i] = new RadioButton(false, labels[i], x, (int) (y + i * diameter * 1.45), diameter);
            }
            radioButtons[selected].isSelected = true;
        }

        public void draw() {
            for (RadioButton radioButton : radioButtons) radioButton.draw();
        }

        public void mousePressed() {
            for (int i = 0; i < radioButtons.length; ++i) {
                if (radioButtons[i].mousePressed()) {
                    for (int j = 0; j < radioButtons.length; ++j) {
                        if (j != i) radioButtons[j].isSelected = false;
                    }
                    break;
                }
            }
        }
    }

    class RadioButton {
        boolean isSelected;
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
            // dessine le cercle
            stroke(0);
            if (isSelected) {
                fill(0, 201, 191);
            } else {
                noFill();
            }
            circle(x, y, diameter);
            // dessine le V
            if (isSelected) {
                textAlign(CENTER, CENTER);
                textSize(diameter * 0.9f);
                fill(0);
                text("V", x, y - diameter * 0.05f);
            }
            // dessine le label
            fill(0);
            textAlign(LEFT, CENTER);
            textSize(diameter * 0.75f);
            text(label, x + diameter, y - diameter * 0.2f);
        }

        public boolean mousePressed() {
            if (!isSelected && isMouseIn()) {
                isSelected = true;
                return true;
            }
            return false;
        }

        public boolean isMouseIn() {
            int deltaX = mouseX - x;
            int deltaY = mouseY - y;
            return Math.sqrt(deltaX * deltaX + deltaY * deltaY) <= diameter / 2;
        }
    }
}
