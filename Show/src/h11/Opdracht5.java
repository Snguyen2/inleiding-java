package h11;
import java.awt.*;
import java.applet.*;


public class Opdracht5 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int tel = 0;
        int y = 0;

        while(tel < 50) {
            y += 12;
            g.drawRect(y, y, 12, 12);
            tel++;
        }
    }
}
