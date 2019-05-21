package Shapes;

public class Square extends Rectangle {


    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea () {
        return super.length * super.length;
    }
    @Override
    public double getPerimeter () {
        return 4 * super.length;
    }
}
