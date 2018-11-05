package h06;

import java.awt.*;
import java.applet.*;


public class H6O4 extends Applet {
    double a;
    double b;
    double c;
    double d;
    double uitkomst;
    double uitkomst1;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        uitkomst = (a + b + c) / d;
        uitkomst1 = 6.3;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst1, 20, 20);{
        }
    }
}