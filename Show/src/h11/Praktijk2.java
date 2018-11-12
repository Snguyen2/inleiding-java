package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijk2 extends Applet {
    Button k;
    int x;

    public void init() {
        x = 0;
        k = new Button();
        k.setLabel("OK");
        k.addActionListener(new ta());
        add(k);
    }

    class ta implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            x += 1;
            repaint();
        }
    }

    public void paint(Graphics g) {
        int tel = 1;
        int y = 0;
        while (tel < 11) {
            y += 20;
            g.drawString(tel+ " x " +x+ " = " +tel*x, 10, y);
            tel++;
            if (x == 11) {
                x -= 10;
            }
        }
    }
}