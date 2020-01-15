public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static distance(Point a, Point b) {
        double dx = Math.abs(a.x - b.x);
        double dy = Math.abs(a.y - b.y);
        return Math.hypot(dx, dy);
    }

    public distance(Point p) {
        double dx = Math.abs(this.x - p.x);
        double dy = Math.abs(this.y - p.y);
        return Math.hypot(dx, dy);
    }
    
}