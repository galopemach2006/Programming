package Interface_Practice;

import static java.lang.System.out;

public class Rectangle implements Shapes{
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public void getDetails() {
        out.println(
            "Type: Rectangle" + "\nLength: " + length + "\nWidth: " + width
        );
    }
}

