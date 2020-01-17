public class Square {

    private Point a;
    private double width;
    private double height;

    public Square(Point a, width, height) {
        this.a = a;
        this.width = width;
        this.height = height;
    }

    public double area() {
        return base * height;
    }

    public double perimiter() {
        return 2 * base + 2 * height;
    }
}