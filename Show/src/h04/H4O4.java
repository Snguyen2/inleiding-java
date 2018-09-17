package h04;

import java.awt.*;
import java.applet.*;

public class H4O4 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(100, 50, 100, 200);
        g.drawLine(100, 200, 250, 200);
        g.drawLine(100, 150, 250, 150);
        g.drawLine(100, 100, 250, 100);
        g.drawLine(100, 125, 250, 125);
        g.drawLine(100, 175, 250, 175);
        g.drawLine(100, 75, 250, 75);
        g.setColor(Color.blue);
        g.fillRect(120, 160, 20, 40);
        g.drawString("Valerie", 110, 220);
        g.setColor(Color.green);
        g.fillRect(160, 100, 20, 100);
        g.drawString("Jeroen", 150, 220);
        g.setColor(Color.red);
        g.fillRect(200, 120, 20, 80);
        g.drawString("Hans", 200, 220);
        g.setColor(Color.black);
        g.drawString("75 kg", 50, 130);
        g.drawString("50 kg", 50, 160);
        g.drawString("100 kg", 50, 100);
        g.drawString("125 kg", 50, 70);
        g.drawString("25 kg", 50, 190);
        g.drawString("0 kg", 70, 215);
        g.drawString("LIJNDIAGRAM:", 20, 40);
    }
}
