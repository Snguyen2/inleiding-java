package h06;

import java.awt.*;
import java.applet.*;


public class H6O2 extends Applet {
    int a;
    int b;
    int c;
    int d;
    int uitkomst;
    int uitkomst2;
    int uitkomst3;

    public void init() {
        a = 60;
        b = 60;
        c = 1440;
        d= 544320;
        uitkomst = a*b;
        uitkomst2 = a*c;
        uitkomst3 = a*d;
    }

    public void paint(Graphics g) {
        g.drawString("1 uur heeft " + uitkomst + " seconden", 20, 20);
        g.drawString("1 dag heeft " + uitkomst2 + " seconden", 20, 50);
        g.drawString("1 jaar heeft " + uitkomst3 + " seconden", 20, 80);
    }
}