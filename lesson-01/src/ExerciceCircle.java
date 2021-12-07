import processing.core.PApplet;

public class ExerciceCircle extends PApplet {
    final int RED = color(255, 0, 0);
    final int GREEN = color(0, 255, 0);
    final int BLUE = color(0, 0, 255);
    Circle circle = new Circle(100, 100, 30, RED);

    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void draw() {
        fill(random(255), random(255), random(255));
        circle.drawIt();
    }

    @Override
    public void keyReleased() {
        circle.changeColorOnKey();
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"Exercice"}, new ExerciceCircle());
    }

    class Circle {
        int x;
        int y;
        int diameter;
        int color;

        public Circle(int pX, int pY, int pDiameter, int pColor) {
            this.x = pX;
            this.y = pY;
            this.diameter = pDiameter;
            this.color = pColor;
        }

        void drawIt() {
            fill(color);
            circle(x, y, diameter);
        }

        public void changeColorOnKey() {
            switch (key) {
                case 'r':
                    color = RED;
                    break;
                case 'v':
                    color = GREEN;
                    break;
                case 'b':
                    color = BLUE;
            }
        }
    }
}
