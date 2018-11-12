package h11;
import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int tel;
        int y = 0;

        for(tel = 0; tel < 10; tel++) {
            y += 20;
            g.drawLine(50 , y, 300, y );
        }
    }
}
