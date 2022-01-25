package demo.square;

import java.util.Date;

public class Square {
    private int size;
    private Date timestamp;

    public Square() {
    }

    public Square(int size) {
        this.size = size;
        timestamp = new Date();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        timestamp = new Date();
    }

    public Date getTimestamp() {
        return (Date) timestamp.clone();
    }

    public int getArea() {
        return size * size;
    }

    public int getPerimeter() {
        return 4 * size;
    }
}
