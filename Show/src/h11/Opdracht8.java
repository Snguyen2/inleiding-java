package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht8 extends Applet {

    public void init() {
        setSize(900, 800);
    }
    public void paint(Graphics g) {
        int tel = 0;
        int y = 0;

        while(tel < 101) {
            y += 6;
            g.drawOval(450-tel*3, 450-tel*3, y, y );
            tel++;
        }
    }
}