package exercice5;

import processing.core.PApplet;

public class RectangleOver {
    int x;
    int y;;
    int width = 100;
    int height = 50;

    public RectangleOver(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(PApplet pApplet, int mouseX, int mouseY) {
        if (isOver(mouseX, mouseY)) {
            pApplet.fill(200, 200, 0);
        } else {
            pApplet.fill(255, 255, 0);
        }
        pApplet.rect(x, y, width, height);
    }

    private boolean isOver(int mouseX, int mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }

    public boolean isOver(RectangleOver other) {
        return isOver(other.x, other.y)
                || isOver(other.x + width, other.y)
                || isOver(other.x, other.y + height)
                || isOver(other.x + width, other.y + height);
    }
}
