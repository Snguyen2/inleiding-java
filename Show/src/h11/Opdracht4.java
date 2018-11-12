package h11;
import java.awt.*;
import java.applet.*;


public class Opdracht4 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int tel = 0;
        int y = 0;
        int x = 3;
        int s = 0;

        while(tel < 50) {
            y += 20;
            g.drawString("" + s,170, y );
            tel++;
            s = x*tel;
        }
    }
}