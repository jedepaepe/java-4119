import processing.core.PApplet;

public class TicTacToeApp extends PApplet {
    char player = 'X';
    Box[] boxes = new Box[] {
            new Box(0, 0),
            new Box(100, 0),
            new Box(200, 0),
            new Box(0, 100),
            new Box(100, 100),
            new Box(200, 100),
            new Box(0, 200),
            new Box(100, 200),
            new Box(200, 200)
    };

    @Override
    public void settings() {
        size(300, 300);
    }

    @Override
    public void draw() {
        background(0);
        for (Box box : boxes) box.draw();
    }

    @Override
    public void mousePressed() {
        boolean success = false;
        for (Box box : boxes) success = success || box.keyPresed(player);
        if (success) player = (player == 'X') ? 'O' : 'X';
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{ "TIC TAC TOE"}, new TicTacToeApp());
    }

    class Box {
        int x;
        int y;
        char value = ' ';

        public Box(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void draw() {
            noFill();
            stroke(255);
            square(x, y, 100);
            fill(255);
            textSize(60);
            textAlign(CENTER, CENTER);
            text(value, x + 50, y + 40);
        }

        public boolean keyPresed(char value) {
            if (this.value == ' ' && isMouseIn()) {
                this.value = value;
                return true;
            }
            return false;
        }

        /**
         * indique si la souri est dans le :InputText
         * @return true si la souri est dans le :InputText, false dans le cas contraire
         */
        public boolean isMouseIn() {
            return x <= mouseX && mouseX <= (x + 100) && y <= mouseY && mouseY <= (y + 100);
        }
    }
}
