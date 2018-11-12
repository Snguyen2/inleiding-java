package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht7 extends Applet {

    public void init() {
        setSize(600, 450);
    }

    public void paint(Graphics g) {
        int tel = 0;
        int y = 300;
        while(tel < 60) {
            y -= 6;
            g.drawOval(150+tel*3, 150+tel*3, y, y );
            tel++;
        }
    }
}
