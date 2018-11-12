package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht9 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int tel = 0;
        int y = 0;

        while(tel < 7) {
            y += 20;
            g.setColor(Color.black);
            g.fillRect(y+20, y, 20, 20 );
            g.fillRect(y, y+20, 20, 20 );
            g.fillRect(y+60, y, 20, 20 );
            g.fillRect(y, y+60, 20, 20 );
            g.fillRect(y+100, y, 20, 20 );
            g.fillRect(y, y+100, 20, 20 );
            g.fillRect(y+140, y, 20, 20 );
            g.fillRect(y, y+140, 20, 20 );
            g.drawRect(20, 20, 160, 160 );
            g.setColor(Color.white);
            g.fillRect(180, 40, 120, 120 );
            g.fillRect(40, 180, 120, 120 );
            g.setColor(Color.black);
            g.drawRect(20, 20, 160, 160 );
            tel++;
        }
    }
}
