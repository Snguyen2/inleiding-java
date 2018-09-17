package h06;

import java.awt.*;
import java.applet.*;


public class H6O1 extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 133;
        b = 4;
        uitkomst = a/b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan:", 50, 15);
        g.drawString("Krijgt " + uitkomst + " Euro", 100, 15);
        g.drawString("Ali:", 50, 55);
        g.drawString("Krijgt " + uitkomst + " Euro", 100, 55);
        g.drawString("Jeannette:", 30, 95);
        g.drawString("Krijgt " + uitkomst + " Euro", 100, 95);
        g.drawString("Ik:", 50, 135);
        g.drawString("Krijgt " + uitkomst + " Euro", 100, 135);
    }
}