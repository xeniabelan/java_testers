public class Point {
    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.getX() - p1.getX()) ^ 2 + (p2.getY() - p1.getY()) ^ 2);
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public double distanceMethod(Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - x, 2) + Math.pow(p2.getY() - y, 2));
    }
}
