package exercice5;

import java.util.List;

public class OverRule {

    public static boolean canAdd(List<RectangleOver> rectangleOvers, int x, int y) {
        RectangleOver candidate = new RectangleOver(x, y);
        for (RectangleOver r : rectangleOvers) {
            if (r.isOver(candidate)) {
                return false;
            }
        }
        return true;
    }
}
