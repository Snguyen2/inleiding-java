package h05;

import java.awt.*;
import java.applet.*;

public class H5O2 extends Applet {
    Color fillcolor;
    Color linecolor;
    int width;
    int height;
    int x;

    public void init() {
        fillcolor = Color.blue;
        linecolor = Color.black;
        width = 20;
        height = 40;
        x = 50;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(linecolor);
        g.drawLine(100, 50, 100, 200);
        g.drawLine(100, 200, 250, 200);
        g.drawLine(100, 150, 250, 150);
        g.drawLine(100, 100, 250, 100);
        g.drawLine(100, 125, 250, 125);
        g.drawLine(100, 175, 250, 175);
        g.drawLine(100, 75, 250, 75);
        g.setColor(fillcolor);
        g.fillRect(120, 160, width, height);
        g.drawString("Valerie", 110, 220);
        g.setColor(Color.green);
        g.fillRect(160, 100, width, 100);
        g.drawString("Jeroen", 150, 220);
        g.setColor(Color.red);
        g.fillRect(200, 120, width, 80);
        g.drawString("Hans", 200, 220);
        g.setColor(linecolor);
        g.drawString("75 kg", x, 130);
        g.drawString("50 kg", x, 160);
        g.drawString("100 kg", x, 100);
        g.drawString("125 kg", x, 70);
        g.drawString("25 kg", x, 190);
        g.drawString("0 kg", 70, 215);
        g.drawString("LIJNDIAGRAM:", 20, 40);


    }
}


