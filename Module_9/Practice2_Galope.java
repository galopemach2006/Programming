package Module_9;

import java.awt.*;
import java.awt.event.*;

public class Practice2_Galope {
    private Frame f;
    private Button b1, b2, b3;
    
    public Practice2_Galope() {
        f = new Frame("Color Mixer");
        b1 = new Button("Red");
        b2 = new Button("Green");
        b3 = new Button("Blue");
    }

    public class Colors implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                f.setBackground(Color.RED);
            } else if (e.getSource() == b2) {
                f.setBackground(Color.GREEN);
            } else {
                f.setBackground(Color.BLUE);
            }
        }
    }

    public void launchApp() {
        f.setLayout(new GridLayout(4, 1));
        f.setBackground(Color.GRAY);
        f.setSize(500,200); 
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.pack();
        f.setVisible(true);

        b1.addActionListener(new Colors());
        b2.addActionListener(new Colors());
        b3.addActionListener(new Colors());

    }
    public static void main(String[] args) {
        Practice2_Galope sf = new Practice2_Galope();
        sf.launchApp();
    }
}
