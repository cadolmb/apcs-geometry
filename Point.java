public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point a, Point b) {
        double dx = Math.abs(a.x - b.x);
        double dy = Math.abs(a.y - b.y);
        return Math.hypot(dx, dy);
    }

    public double distance(Point p) {
        double dx = Math.abs(x - p.x);
        double dy = Math.abs(y - p.y);
        return Math.hypot(dx, dy);
    }

}
