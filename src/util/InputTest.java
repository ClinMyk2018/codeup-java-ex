package util;

import Shapes.Circle;

public class InputTest {


    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(input.yesNo());
        System.out.println(input.getInt());
        System.out.println(input.getInt(5, 3));
        System.out.println(input.getDouble());
        System.out.println(input.getDouble(3, 9));
        System.out.println(input.getString());

    }
}
