package Shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.width=length;
        this.length=length;
    }

    @Override
    public void setWidth(double width) {
        this.width=width;
        this.length=width;
    }

    //    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getArea () {
//        return super.length * super.length;
//    }
//    @Override
//    public double getPerimeter () {
//        return 4 * super.length;
//    }
}
