package Interface_Practice;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Circle implements Shapes{
    double pi = PI;
    int r;

    public Circle (int r) {
        this.r = r;
    }

    public double getPerimeter() {
        return 2 * pi * r;
    }

    public double getArea() {
        return pi * pow(r, 2);
    }

    public void getDetails() {
        out.println(
            "Type: Circle" + "\nRadius: " + r 
        );
    }
}
