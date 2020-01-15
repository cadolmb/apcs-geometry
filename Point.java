public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static distance(Point a, Point b) {
        double dx = Math.abs(a.x() - b.x());
        double dy = Math.abs(a.y() - b.y());
        return Math.hypot(dx, dy);
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }
}