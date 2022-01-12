import processing.core.PApplet;

public class DemoUI extends PApplet {

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
