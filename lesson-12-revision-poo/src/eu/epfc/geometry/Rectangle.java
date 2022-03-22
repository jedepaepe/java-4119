package eu.epfc.geometry;

public class Rectangle {
    private final Point point1;
    private final Point point2;

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public boolean contains(Point point) {
        float minX = Math.min(point1.getX(), point2.getX());
        float maxX = Math.max(point1.getX(), point2.getX());
        float minY = Math.min(point1.getY(), point2.getY());
        float maxY = Math.max(point1.getY(), point2.getY());
        return minX <= point.getX() &&
                point.getX() <= maxX &&
                minY <= point.getY() &&
                point.getY() <= maxY;
    }

    public float getWidth() {
        return Math.abs(getPoint1().getX() - getPoint2().getX());
    }

    public float getHeight() {
        return Math.abs(getPoint1().getY() - getPoint2().getY());
    }

    public Point getTopLeft() {
        float minX = Math.min(point1.getX(), point2.getX());
        float minY = Math.min(point1.getY(), point2.getY());
        return new Point(minX, minY);
    }
}
