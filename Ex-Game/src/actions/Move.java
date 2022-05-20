package actions;

import areas.Area;
import traversal.AreaTransition;

public class Move {

    private AreaTransition areaTransition;
    public static final int UP = 0;
    public static final int DOWN = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;

    private int direction;
    private int steps;

    public AreaTransition stepsTransition(int steps) {
        if (steps > 6) {
            System.out.println("Success, you've transitioned to a new sub-area.");
            return areaTransition.next;
        } else {
            return null;
        }
    }
}
