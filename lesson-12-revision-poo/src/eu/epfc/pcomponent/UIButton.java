package eu.epfc.pcomponent;

import eu.epfc.geometry.Point;
import processing.core.PApplet;

public class UIButton extends UIText {

    public UIButton(PApplet pApplet, Point point1, Point point2) {
        super(pApplet, point1, point2);
    }

    @Override
    public void draw() {
        super.draw();
        pApplet.rect(getTopLeft().getX(), getTopLeft().getY(), getWidth(), getHeight());
    }

    @Override
    public void mousePressed() {

    }

    @Override
    public void keyPressed() {
        // nothing
    }
}
