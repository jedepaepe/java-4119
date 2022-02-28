package l09.exercices;

import l09.pconsole.PConsole;

public class TicTacToePConsole extends PConsole {
    final int[][] successes = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
            {0, 3, 6},
            {1, 4, 7},
            {2, 5, 8},
            {0, 4, 8},
            {2, 4, 6}
    };
    final char FREE = '-';
    final char X = 'X';
    final char O = 'O';
    private String board = "---------";
    private char player = X;

    @Override
    public void onInitialize() {
        printBoard();
    }

    @Override
    public boolean onNewLine(String command) {
        if (isValid(command)) printHelp();
        int index = computeIndex(command);
        if (! isFree(index)) printPlayFailed(command);
        else play(index);
        if (isNullGame()) {
            printGameNull();
            return false;
        }
        if (isWinGame()) {
            printGameWin();
            return false;
        }
        switchPlayer();
        printBoard();
        return true;
    }

    private void printGameWin() {
        println(player + " a gagné");
    }

    private boolean isWinGame() {
        for (int[] ids : successes) {
            if (board.charAt(ids[0]) == player && board.charAt(ids[1]) ==player && board.charAt(ids[2]) == player) {
                return true;
            }
        }
        return false;
    }

    private void printGameNull() {
        print("Partie nulle");
    }


    private boolean isNullGame() {
        return ! board.contains("" + FREE);
    }

    private void switchPlayer() {
        player = player == X ? O : X;
    }

    private void play(int index) {
        board = replaceCharAtInString(board, player, index);
    }

    private String replaceCharAtInString(String board, char c, int index) {
        return board.substring(0, index) + c + board.substring(index + 1);
    }

    private void printPlayFailed(String command) {
        println("La case " + command + " est déjà prise");
    }

    private boolean isFree(int index) {
        return board.charAt(index) == FREE;
    }

    private int computeIndex(String command) {
        int y = command.charAt(0) - '1';
        int x = command.charAt(1) - '1';
        return x + y * 3;
    }

    private boolean isValid(String line) {
        return line.length() != 2 && isBetween(line.charAt(0), '1', '3') && isBetween(line.charAt(1), '1', '3');
    }

    private boolean isBetween(char c, char min, char max) {
        return min <= c && c <= max;
    }

    private void printHelp() {
        println("Mauvaise commande");
        println("Les commandes possibles sont 11 - 33");
    }

    private void printBoard() {
        println(board.substring(0, 3));
        println(board.substring(3, 6));
        println(board.substring(6));
    }

    public static void main(String[] args) {
        new TicTacToePConsole().run();
    }
}
