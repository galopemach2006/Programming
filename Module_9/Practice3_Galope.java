package Module_9;

import java.awt.*;
import java.awt.event.*;

public class Practice3_Galope {
    private Frame f;
    private Label l;
    private Button b, b2, b3;
    private TextField t;
    
    
    public Practice3_Galope() {
        f = new Frame("News Portal");
        l = new Label("Daily News", Label.CENTER);
            l.setFont(new Font("Arial", Font.BOLD, 20));
        b = new Button("Menu");
        b2 = new Button("Ads");
        t = new TextField("Search:");
        b3 = new Button("Main Content");
    }
    
    public class mainContent implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b) {
                b3.setLabel("I clicked Menu");
            } else if (e.getSource() == b2) {
                b3.setLabel("I clicked Ads");
            } else {
                b3.setLabel("I clicked Main");
            }
        }
    }
    
    public void launchApp() {
        f.add(l, BorderLayout.NORTH);
        f.add(b, BorderLayout.WEST);
        f.add(b2, BorderLayout.EAST);
        f.add(t, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.CENTER);

        f.setSize(300, 150);
        f.setVisible(true);

        b.addActionListener(new mainContent());
        b2.addActionListener(new mainContent());
    }

    public static void main(String[] args) {
        Practice3_Galope p = new Practice3_Galope();
        p.launchApp();
    }
}
