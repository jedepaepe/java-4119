package students.ihb;

import processing.core.PApplet;

public class TicTacToe extends PApplet {
    private Box[][] boxes = new Box[][]{new Box[]{new Box(0, 0), new Box(200, 0), new Box(400, 0)},
            new Box[]{new Box(0, 200), new Box(200, 200), new Box(400, 200)},
            new Box[]{new Box(0, 400), new Box(200, 400), new Box(400, 400)}};
    private int deltaX, xX;
    private int deltaY, yY;
    private char player = 'X';
    private boolean gameEnded = false;

    @Override
    public void settings() {
        size(300, 300);
    }

    @Override
    public void setup() {
        deltaX = width / 3;
        deltaY = height / 3;
        xX = width / 2;
        yY = height / 2;
        frameRate(3);
        background(0);
        noFill();
        stroke(255);
        textAlign(CENTER, CENTER);
        textSize(50);
        drawBoard(boxes);
    }

    @Override
    public void draw() {
        if (gameEnded) {
            background(0);
            noFill();
            stroke(255);
            textAlign(CENTER, CENTER);
            textSize(50);
            drawBoard(boxes);
        }
    }

    @Override
    public void mousePressed() {
        for (int j = 0; j < boxes.length; j++) {
            for (int i = 0; i < boxes.length; i++) {
                if (boxes[i][j].getValue() == ' ' && boxes[i][j].mousePressed(player) && !gameEnded) {
                    if (player == 'X') {
                        boxes[i][j].setValue(player);
                        player = 'O';
                    } else {
                        boxes[i][j].setValue(player);
                        player = 'X';
                    }
                    text(boxes[i][j].getValue(), i * 100 + 50, j * 100 + 50);
                }
            }
        }

        if (checkWinner(boxes) == 'X' || checkWinner(boxes) == 'O') {
            fill(25, 25, 50, 127);
            rect(0, deltaY, width, deltaY);
            textSize(45);
            fill(255);
            text(checkWinner(boxes) + " is the winner! ", xX, yY);
            gameEnded = true;
        } else {
            if (boardIsFull(boxes)) {
                fill(25, 25, 50, 127);
                rect(0, deltaY, width, deltaY);
                textSize(45);
                fill(255);
                text(" Tie game! ", xX, yY);
                gameEnded = true;
            }
        }
    }

    public void drawBoard(Box[][] boxes) {
        gameEnded = false;
        for (int j = 0; j < boxes.length; j++) {
            for (int i = 0; i < boxes.length; i++) {
                boxes[i][j] = new Box(i * 100, j * 100);
                boxes[i][j].draw();
                boxes[i][j].setValue(' ');
            }
        }
    }

    public boolean boardIsFull(Box[][] boxes) {
        for (int j = 0; j < boxes.length; j++) {
            for (int i = 0; i < boxes.length; i++) {
                if (boxes[i][j].getValue() == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public char checkWinner(Box[][] boxes) {
        for (int index = 0; index < boxes.length; index++) {
            if (boxes[0][index].getValue() == boxes[1][index].getValue() && boxes[0][index].getValue() == boxes[2][index].getValue() && boxes[0][index].getValue() != ' ') {
                return boxes[0][index].getValue();
            }
            if (boxes[index][0].getValue() == boxes[index][1].getValue() && boxes[index][0].getValue() == boxes[index][2].getValue() && boxes[index][0].getValue() != ' ') {
                return boxes[index][0].getValue();
            }
        }
        if (boxes[0][0].getValue() == boxes[1][1].getValue() && boxes[0][0].getValue() == boxes[2][2].getValue() && boxes[0][0].getValue() != ' ') {
            return boxes[0][0].getValue();
        }
        if (boxes[0][2].getValue() == boxes[1][1].getValue() && boxes[0][2].getValue() == boxes[2][0].getValue() && boxes[0][2].getValue() != ' ') {
            return boxes[0][2].getValue();
        }
        return ' ';
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"tic tac toe"}, new TicTacToe());
    }

    public class Box {
        private int x;
        private int y;
        private char value = ' ';

        public Box(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public char getValue() {
            return value;
        }

        public void setValue(char value) {
            this.value = value;
        }

        public void draw() {
            rect(x, y, deltaX, deltaY);
        }

        public boolean mousePressed(char value) {
            if (mouseX >= x && mouseX <= x + width / 3 && mouseY >= y && mouseY <= y + height / 3) {
                this.value = value;
                return true;
            } else {
                return false;
            }
        }
    }
}
