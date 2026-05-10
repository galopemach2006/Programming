import java.awt.*;

public class Galope_Module9 {
    private Frame f;
    private Label l1, l2, l3, l4;
    private Button b1, b2;
    private TextField t1, t2, t3, t4;
    private Panel p1, p2, p3, p4, p5;

    public Galope_Module9()  {
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
    }

    public void launchApp() {
        f.setLayout(new GridLayout(6, 1));
        f.setSize(500, 200);

        p1.add(l1); p1.add(t1);  
        p2.add(l2); p2.add(t2);
        p3.add(l3); p3.add(t3);
        p4.add(l4); p4.add(t4);
        p5.add(b1); p5.add(b2);
        
        f.add(p1); f.add(p2); f.add(p3); f.add(p4); f.add(p5);
        
        f.setVisible(true);
        f.setLocation(500, 200);
    }

    public static void main(String[] args) {
        Galope_Module9 g = new Galope_Module9();
        g.launchApp();
    }
}
