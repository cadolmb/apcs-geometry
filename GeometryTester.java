class GeometryTester {

    public static void main(String[] args) {
        Point a = new Point(8, 11);
        Point b = new Point(15, 26);
        Point c = new Point(31, 15);
        Triangle triangle = new Triangle(a, b, c);

        System.out.println(triangle.area());
        System.out.println(Point.distance(a, b));
    }
}
