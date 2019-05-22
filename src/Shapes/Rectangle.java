package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }
}


//    protected double width;
//    protected double length;
//
//    public Rectangle (double x, double y){
//        width = x;
//        length = y;
//    }
//
//    public double getArea() {
//        return width * length;
//    }
//
//    public double getPerimeter() {
//        return 2 * length + width * 2;
//    }



