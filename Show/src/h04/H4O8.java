package h04;

import java.awt.*;
import java.applet.*;

public class H4O8 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawString("Afgeronde Rechthoek", 40, 240);
        g.drawLine(150, 30, 30, 30);
        g.drawRect(40, 70, 100, 50);
        g.drawRoundRect(40, 170, 100, 50, 20, 20);
        g.setColor(Color.red);
        g.drawString("Lijn", 80, 45);
        g.drawString("Rechthoek", 60, 140);
        g.setColor(Color.blue);
        g.drawString("Gevulde Ovaal", 190, 240);
        g.drawString("Gevulde rechthoek met ovaal", 140, 140);
        g.setColor(Color.green);
        g.drawString("Cirkel", 335, 240);
        g.drawString("Taartpunt met ovaal eromheen", 300, 140);
        g.setColor(Color.magenta);
        g.fillRect(180, 70, 100, 50);
        g.fillRoundRect(180, 170, 100, 50, 360, 360);
        g.fillArc(300, 70, 100, 50, 0, 60);
        g.setColor(Color.black);
        g.drawRoundRect(180, 70, 100, 50, 360, 360);
        g.drawRoundRect(300, 70, 100, 50, 360, 360);
        g.drawRoundRect(320, 160, 60, 60, 360, 360);





    }
}