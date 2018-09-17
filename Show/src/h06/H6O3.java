package h06;

import java.awt.*;
import java.applet.*;


public class H6O3 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 10;
        b = 10;
        c = -30;
        uitkomst = a+b+c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
