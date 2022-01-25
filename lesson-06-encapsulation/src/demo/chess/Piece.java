package demo.chess;

public class Piece {
    private String name;
    private boolean isBlack;
    private int line;
    private int column;
    private boolean isCaptured;

    // constructeur
    // signature Piece()
    public Piece() {
    }

    // constructeur
    // signature Piece(String, boolean, int, int, boolean)
    public Piece(String name, boolean isBlack, int line, int column, boolean isCaptured) {
        this.name = name;
        this.isBlack = isBlack;
        this.line = line;
        this.column = column;
        this.isCaptured = isCaptured;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public void setBlack(boolean black) {
        isBlack = black;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isCaptured() {
        return isCaptured;
    }

    public void setCaptured(boolean captured) {
        isCaptured = captured;
    }
}
