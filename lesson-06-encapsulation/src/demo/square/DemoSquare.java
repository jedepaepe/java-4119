package demo.square;

import java.util.Date;

public class DemoSquare {
    public static void main(String[] args) {
        Square s1 = new Square(10);
        System.out.println(s1.getSize());
        s1.setSize(1);
        System.out.println(s1.getSize());
        System.out.println(s1.getTimestamp());
        Date ts = s1.getTimestamp();
        ts = new Date();

        Square s2 = new Square();
        System.out.println(s2.getSize());
    }
}
