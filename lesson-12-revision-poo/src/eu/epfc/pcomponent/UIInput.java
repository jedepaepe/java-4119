package eu.epfc.pcomponent;

import eu.epfc.geometry.Point;
import processing.core.PApplet;

public class UIInput extends AbstractUIComponent {
    private String text = "";
    private boolean hasFocus = false;

    public UIInput(PApplet pApplet, Point point1, Point point2) {
        super(pApplet, point1, point2);
    }

    public String getText() {
        return text;
    }

    @Override
    public void draw() {
        pApplet.rect(getTopLeft().getX(), getTopLeft().getY(), getWidth(), getHeight());
        pApplet.text(text, getTopLeft().getX(), getTopLeft().getY());
    }

    @Override
    public void mousePressed() {
        hasFocus = contains(new Point(pApplet.mouseX, pApplet.mouseY));
    }

    @Override
    public void keyPressed() {
        if (hasFocus) {
            text += pApplet.key;
        }
    }
}
