package Interface_Practice;

import static java.lang.System.out;

public class Triangle implements Shapes{
    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double halfP() {
        return getPerimeter() / 2;
    }

    public double getArea() {
        return Math.sqrt(halfP() * (halfP() - side1) * (halfP() - side2) * (halfP() - side3));
    }

    public void getDetails() {
        out.println(
            "Type: Triangle" + 
            "\nSide 1: " + side1 + "\nSide 2: " + side2 +"\nSide 3: " + side3   
        );
    }
}
