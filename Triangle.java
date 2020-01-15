import java.util.*;
public class Triangle{
    Point point1;
    Point point2;
    Point point3;

    public triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double findArea(){
        return (Math.abs((point1.x * (point2.y - point3.y)) + 
                         (point2.x * (point3.y - point1.y)) +
                         (point3.x * (point1.y - point2.y)) / 2.0);
    }
}