public class Square {

    private Point[] points = new Point[4];

    private double width;
    private double height;

    public Square(Point p, width, height) {
        this.width = width;
        this.height = height;

        point[0] = p;
        points[1] = new Point(p1.x + width, p1.y);
        points[2] = new Point(p1.x + width, p1.y + height);
        points[3] = new Point(p1.x, p1.y + height);

    }

    public double area() {
        return base * height;
    }

    public double perimiter() {
        return 2 * base + 2 * height;
    }

    public Point[] points() {
        return points;
    }

    public double xLeft() {
        points[0].x;
    }

    public double xRight() {
        points[0].x + width;
    }

    public double yBottom() {
        points[0].y;
    }

    public double yTop() {
        points[0].y + height;;
    }

    public static boolean squaresIntersect(Square s1, Square s2) {
        for (Point p : s1.points()) {
            if insideSquare(p, s2) {
                return true;
            }
        }
        return false;
    }

    public static boolean insideSquare(Point p, Square s) {
        if (p.x > s.xLeft() && p.x < s.xRight()) && (p.y > s.yBottom() && p.y < s.yTop) {
            return true;
        }
        return false;
    }
}