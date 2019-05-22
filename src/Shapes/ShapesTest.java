package Shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Rectangle(8.8, 9.9);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(8.8);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());




//        Rectangle box1 = new Rectangle(4,5);
//        Square box2 = new Square(5);
//

//        System.out.println(square.getPerimeter());
//        System.out.println(square.getArea());
//    }

    }
}
