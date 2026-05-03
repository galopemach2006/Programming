package Module_9;

import java.awt.*;

public class Practice1_Galope {
    private Frame f;
    private Label name, title, email;

    public Practice1_Galope() {
        f = new Frame("Business Card");
        name = new Label("Name: Mach Julian N. Galope");
        title = new Label("Title: Student Developer");
        email = new Label("Email: mach@example.com");
    }

    public void initAPP() {
        f.setLayout(new FlowLayout());
        f.setBackground(Color.gray);
        f.setSize(300, 150);
        f.add(name);
        f.add(title, Label.CENTER);
        f.add(email, Label.CENTER);

        f.pack();
        f.setVisible(true);
        
    }

    public static void main(String[] args) {
        Practice1_Galope sf = new Practice1_Galope();
        sf.initAPP();
    }
}