package Shapes;

public class Rectangle {
    protected double width;
    protected double length;

    public Rectangle (double x, double y){
        width = x;
        length = y;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * length + width * 2;
    }
}


