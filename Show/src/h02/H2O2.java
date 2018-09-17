package h02;

import java.applet.*;
import java.awt.*;


public class H2O2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Sang", 50, 70);
        g.setColor(Color.red);
        g.drawString("Nguyen", 50, 80 );

    }
}
