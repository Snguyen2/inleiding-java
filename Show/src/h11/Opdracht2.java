package h11;


import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int tel = 10;
        int y = 240;

        while(tel < 21) {
            y -= 20;
            g.drawString("" + tel, 170, y );
            tel++;
        }
    }
}