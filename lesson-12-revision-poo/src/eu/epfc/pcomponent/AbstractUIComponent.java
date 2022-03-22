package eu.epfc.pcomponent;

import eu.epfc.geometry.Point;
import eu.epfc.geometry.Rectangle;
import processing.core.PApplet;

public abstract class AbstractUIComponent extends Rectangle {
    protected final PApplet pApplet;

    public AbstractUIComponent(PApplet pApplet, Point point1, Point point2) {
        super(point1, point2);
        this.pApplet = pApplet;
    }

    public abstract void draw();
    public abstract void mousePressed();
    public abstract void keyPressed();
}
