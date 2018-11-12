package h11;
import java.awt.*;
import java.applet.*;


public class Opdracht6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int tel = 0;
        int y = 60;

        while(tel < 50) {
            y -= 10;
            g.drawOval(80+tel*5, 80+tel*5, y, y );
            tel++;
        }
    }
}