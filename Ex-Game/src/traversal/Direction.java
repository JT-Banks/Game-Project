package traversal;

public class Direction {
    public static final int UP = 0;
    public static final int DOWN = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;

    public static void move(int direction) {
        switch (direction) {
            case UP:
                System.out.println("You traverse the area upwards.");
                break;
            case DOWN:
                System.out.println("DOWN");
                break;
            case LEFT:
                System.out.println("LEFT");
                break;
            case RIGHT:
                System.out.println("RIGHT");
                break;
            default:
                System.out.println("Invalid direction");
                break;
        }
    }
}
