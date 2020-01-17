public class Square {

    private Point a;
    private Point b;
    private Point c;
    private Poind d;

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double area() {

        // Find which line segments are base and height
        double ab = a.distance(b);
        double ac = a.distance(c);
        double ad = a.distance(c);

        double hypot = ab;
        double base = ab;
        double height = ab;

        if (ac > hypot) {
            hypot = ac;
        }
        else {
            base = ac;
        }
        if (ad > hypot) {
            hypot = ad;
        }
        else {
            base = ad;
        }

        return base*height;
    }

}