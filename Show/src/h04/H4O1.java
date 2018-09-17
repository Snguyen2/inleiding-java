package h04;

import java.awt.*;
import java.applet.*;

public class H4O1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(40, 150, 250, 150);
        g.drawLine(40, 150, 150, 75);
        g.drawLine(250, 150, 150, 75);
    }
}




