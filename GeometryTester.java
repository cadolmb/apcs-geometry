class GeometryTester {

    public static void main(String[] args) {

        System.out.println("\nGeometry Tester!\n");

        Point a = new Point(0, 0);
        Point b = new Point(5, 5);
        Point c = new Point(4, 6);
        Triangle triangle = new Triangle(a, b, c);

        System.out.println("area of triangle: " + triangle.area());
        System.out.println("distance between a and b: " + Point.distance(a, b));

        Square s1 = new Square(a, 20, 30);
        Square s2 = new Square(b, 10, 10);

        System.out.println("\narea of s1: " + s1.area());
        System.out.println("perimiter of s2: " + s2.perimeter());

        System.out.println("\ndo s1 and s2 intersect? " + Square.squaresIntersect(s1, s2));
    }
}
