public class Square {

    private Point p;
    private double width;
    private double height;

    public Square(Point p, double width, double height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * width + 2 * height;
    }

    public double xLeft() {
        return p.x;
    }

    public double xRight() {
        return p.x + width;
    }

    public double yBottom() {
        return p.y;
    }

    public double yTop() {
        return p.y + height;
    }

    public static boolean squaresIntersect(Square s1, Square s2) {
        if ( s1.xRight() < s2.xLeft() ) return false;
        if ( s1.xLeft() > s2.xRight() ) return false;
        if ( s1.yBottom() > s2.yTop() ) return false;
        if ( s1.yTop() < s2.yBottom() ) return false;
        return true;
    }

}
