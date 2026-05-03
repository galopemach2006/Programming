package Interface_Practice;

import static java.lang.System.out;

public class TestShapes_WithException {
        public static void main(String[] args) {
            try {
                if (args.length == 0) {
                    throw new IllegalArgumentException("Pass one to three values via command line.");
                }

                else if (args.length > 3) {
                    throw new IllegalArgumentException("Limit your arguments to a maximum of 3 values.");
                }


                int []val = new int[args.length];
        
                for (int i = 0; i < val.length; i++) {
                    val[i] = Integer.parseInt(args[i]);

                    if (val[i] < 0) {
                        throw new IllegalArgumentException("A negative value was passed.");
                    }      
                }

                Shapes shapes = null;
            
                if (args.length == 1) {
                    shapes = new Circle(val[0]);
                } else if (args.length == 2) {
                    if (val[0] == val[1]) {
                        shapes = new Square(val[0]);
                    } else {
                        if (val[0] < val[1]) {
                            shapes = new Rectangle(val[1], val[0]);
                        } else {
                            shapes = new Rectangle(val[0], val[1]);
                        }
                        
                    } 
                } else if (args.length == 3) {
                    shapes = new Triangle(val[0], val[1], val[2]);
                }
                shapes.getDetails();
                out.println("Perimeter: " + shapes.getPerimeter());
                out.println("Area: " + shapes.getArea()); 

            
            } catch (NumberFormatException e) {
                System.out.println("A NumberFormatException is caught.");
            }
            
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "\nAn IllegalArgumentException is caught.");
            }
        }                   
}
