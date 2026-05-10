import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Galope_Module10 {
    private Frame f;
    private Label l1, l2, l3, l4;
    private Button b1, b2;
    private TextField t1, t2, t3, t4;
    private Panel p1, p2, p3, p4, p5, pColor; 

    public Galope_Module10() {
        f = new Frame("My Color Calculator");
        l1 = new Label("Red: ");
        l2 = new Label("Green: ");
        l3 = new Label("Blue: ");
        l4 = new Label("Alpha: ");
        b1 = new Button("Compute");
        b2 = new Button("Clear");
        t1 = new TextField("0", 20);
        t2 = new TextField("0", 20);
        t3 = new TextField("0", 20);
        t4 = new TextField("255", 20);
        
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        p5 = new Panel();
        pColor = new Panel(); 
    }

    public void launchApp() {
        f.setLayout(new GridLayout(6, 1));
        f.setSize(400, 400);

        p1.add(l1); p1.add(t1);
        p2.add(l2); p2.add(t2);
        p3.add(l3); p3.add(t3);
        p4.add(l4); p4.add(t4);
        p5.add(b1); p5.add(b2);

        f.add(p1); f.add(p2); f.add(p3); f.add(p4); f.add(p5);
        f.add(pColor); 

        f.setVisible(true);
        f.setLocation(500, 200);
        b1.addActionListener(new Compute());
        b2.addActionListener(new ClearButton());
    }

    public class ClearButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t1.setText("0");
            t2.setText("0");
            t3.setText("0");
            t4.setText("255");
            pColor.setBackground(Color.WHITE); 
        }
    }

    public class Compute implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int r = Integer.parseInt(t1.getText());
                int g = Integer.parseInt(t2.getText());
                int b = Integer.parseInt(t3.getText());
                int a = Integer.parseInt(t4.getText());

                if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255 || a < 0 || a > 255) {
                    throw new Exception("Value out of range (0-255)");
                }

                Color c = new Color(r, g, b, a);
                pColor.setBackground(c);

            } catch (NumberFormatException nfe) {
                System.out.println("Error: Please enter a valid whole number (no blanks or letters).");
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Galope_Module10 g = new Galope_Module10();
        g.launchApp();
    }
}