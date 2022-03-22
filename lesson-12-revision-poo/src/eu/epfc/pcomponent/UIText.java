package eu.epfc.pcomponent;

import eu.epfc.geometry.Point;
import processing.core.PApplet;

public class UIText extends AbstractUIComponent {
    private String text = "----vide----";   // TODO replace by ""

    public UIText(PApplet pApplet, Point point1, Point point2) {
        super(pApplet, point1, point2);
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void draw() {
        pApplet.text(text, getTopLeft().getX(), getTopLeft().getY());
    }

    @Override
    public void mousePressed() {
        System.out.println("UIText mousePressed");
    }

    @Override
    public void keyPressed() {
        System.out.println("UIText keyPressed");
    }
}
