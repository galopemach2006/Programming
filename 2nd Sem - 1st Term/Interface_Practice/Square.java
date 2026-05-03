package Interface_Practice;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Square implements Shapes {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return pow(side, 2);
    }

    public double getPerimeter() {
        return side * 4;
    }

    public void getDetails() {
        out.println(
            "Type: Square"
        );
    }
}
